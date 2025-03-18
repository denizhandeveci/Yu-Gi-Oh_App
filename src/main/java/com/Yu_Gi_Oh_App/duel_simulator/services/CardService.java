package com.Yu_Gi_Oh_App.duel_simulator.services;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.SpellCard;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.TrapCard;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.MonsterCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.SpellCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.TrapCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.DeckRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.MonsterCardRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.SpellCardRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.TrapCardRepository;
import jakarta.persistence.Access;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CardService {
    @Autowired
    private final MonsterCardRepository monsterCardRepository;
    @Autowired
    private final SpellCardRepository spellCardRepository;
    @Autowired
    private final TrapCardRepository trapCardRepository;
    @Autowired
    private final DeckRepository deckRepository;
    private final MonsterCardMapper monsterCardMapper;
    private final SpellCardMapper spellCardMapper;
    private final TrapCardMapper trapCardMapper;

    public CardService(MonsterCardRepository monsterCardRepository, SpellCardRepository spellCardRepository,
                       TrapCardRepository trapCardRepository,DeckRepository deckRepository,
                       MonsterCardMapper monsterCardMapper,
                       SpellCardMapper spellCardMapper, TrapCardMapper trapCardMapper) {

        this.monsterCardRepository = monsterCardRepository;
        this.spellCardRepository = spellCardRepository;
        this.trapCardRepository = trapCardRepository;
        this.deckRepository = deckRepository;
        this.monsterCardMapper = monsterCardMapper;
        this.spellCardMapper = spellCardMapper;
        this.trapCardMapper = trapCardMapper;
    }

    public MonsterCard getMonsterCardByName(String name) {
        return null;
    }

    public MonsterCardEntity createMonsterCard(MonsterCard monsterCard) {
        MonsterCardEntity monsterCardEntity = monsterCardMapper.toMonsterCardEntity(monsterCard);
        return monsterCardRepository.save(monsterCardEntity);
    }

    public List<MonsterCardEntity> createMonsterCardList (List<MonsterCard> monsterCards){
        List<MonsterCardEntity> monsterCardEntityList = new ArrayList<>();
        for (MonsterCard elem : monsterCards ){
            monsterCardEntityList.add(monsterCardMapper.toMonsterCardEntity(elem));
        }
        return monsterCardRepository.saveAll(monsterCardEntityList);
    }

    public MonsterCardEntity getMonsterCardById (Long id){
        return monsterCardRepository.findById(id).orElse(null);
    }

    public MonsterCardEntity getRandomMonsterCard() {
        Long dataTableSize = monsterCardRepository.count();
        Random random = new Random();
        Long selectedId = random.nextLong(1,(dataTableSize+1));
        return monsterCardRepository.findById(selectedId).orElse(null);
    }

    public String deleteMonsterCardById(Long id){
        Optional<MonsterCardEntity> monsterCardEntity = monsterCardRepository.findById(id);
        if(monsterCardEntity.isPresent()){
            monsterCardRepository.delete(monsterCardEntity.get());
            return monsterCardEntity.get().getName() + " has been delete.";
        }else{
            return "Entity with ID " + id + " not found.";
        }
    }

    public MonsterCardEntity updateMonsterCard(Long id,MonsterCard monsterCard){
        MonsterCardEntity monsterCardEntity = monsterCardRepository.findById(id).orElse(null);
        MonsterCard cardToBeUpdated = monsterCardMapper.toMonsterCard(monsterCardEntity);
        long originalId = monsterCardEntity.getId();
        monsterCardRepository.delete(monsterCardEntity);
        cardToBeUpdated.setId(originalId);
        cardToBeUpdated.setName(monsterCard.getName());
        cardToBeUpdated.setAttackPoints(monsterCard.getAttackPoints());
        cardToBeUpdated.setDefensePoints(monsterCard.getDefensePoints());
        cardToBeUpdated.setCardContent(monsterCard.getCardContent());
        cardToBeUpdated.setCardType(monsterCard.getCardType());
        MonsterCardEntity updatedCard = monsterCardMapper.toMonsterCardEntity(cardToBeUpdated);

        return monsterCardRepository.save(updatedCard);

    }

    public String deleteAllMonsterCards(){
        Long count = monsterCardRepository.count();
        if(count == 0){
            return "No monster cards to delete";
        }else{
            monsterCardRepository.deleteAll();
            return count + " monster cards have been deleted";
        }
    }
    @Transactional
    public void updateMonsterCardIdsSafely() {
        monsterCardRepository.createTempTable();
        monsterCardRepository.updateMonsterCardIds();
        monsterCardRepository.dropTempTable();
    }

    public SpellCardEntity createSpellCard(SpellCard spellCard ) {
        SpellCardEntity spellCardEntity = spellCardMapper.toSpellCardEntity(spellCard);
        return spellCardRepository.save(spellCardEntity);
    }

    public List<SpellCardEntity> createSpellCardList(List<SpellCard> spellCardList){
        List<SpellCardEntity> spellCardEntityList = new ArrayList<>();
        for(SpellCard elem : spellCardList){
            spellCardEntityList.add(spellCardMapper.toSpellCardEntity(elem));
        }
        return spellCardRepository.saveAll(spellCardEntityList);
    }

    public SpellCardEntity getSpellCardById(Long id){
        return spellCardRepository.findById(id).orElse(null);
    }

    public SpellCardEntity getRandomSpellCard() {
        Long dataTableSize = spellCardRepository.count();
        Random random = new Random();
        Long selectedId = random.nextLong(1,(dataTableSize+1));
        return spellCardRepository.findById(selectedId).orElse(null);
    }

    public String deleteSpellCardById(Long id){

        Optional<SpellCardEntity> spellCardEntity = spellCardRepository.findById(id);
        if(spellCardEntity.isPresent()){
            spellCardRepository.delete(spellCardEntity.get());
            return spellCardEntity.get().getName() + " has been delete.";
        }else{
            return "Entity with ID " + id + " not found.";
        }
    }

    public String deleteAllSpellCards(){
        Long count = spellCardRepository.count();
        if(count == 0){
            return "No spell cards to delete";
        }else{
            spellCardRepository.deleteAll();
            return count + " spell cards have been deleted";
        }
    }

    public TrapCardEntity createTrapCard(TrapCard trapCard) {
        TrapCardEntity trapCardEntity = trapCardMapper.toTrapCardEntity(trapCard);
        return trapCardRepository.save(trapCardEntity);
    }



    public TrapCardEntity getRandomTrapCard() {
        Long dataTableSize = trapCardRepository.count();
        Random random = new Random();
        Long selectedId = random.nextLong(1,(dataTableSize+1));
        return trapCardRepository.findById(selectedId).orElse(null);
    }

    public TrapCardEntity getTrapCardById(Long id){
        return trapCardRepository.findById(id).orElse(null);
    }

    public String deleteTrapCardById(Long id){

        Optional<TrapCardEntity> trapCardEntity = trapCardRepository.findById(id);
        if(trapCardEntity.isPresent()){
            trapCardRepository.delete(trapCardEntity.get());
            return trapCardEntity.get().getName() + " has been delete.";
        }else{
            return "Entity with ID " + id + " not found.";
        }
    }


}
