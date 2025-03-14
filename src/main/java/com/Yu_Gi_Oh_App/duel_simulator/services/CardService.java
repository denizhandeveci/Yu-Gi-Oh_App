package com.Yu_Gi_Oh_App.duel_simulator.services;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.SpellCard;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.TrapCard;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.MonsterCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.SpellCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.TrapCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.MonsterCardRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.SpellCardRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.TrapCardRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CardService {
    @Autowired
    private final MonsterCardRepository monsterCardRepository;
    @Autowired
    private final SpellCardRepository spellCardRepository;
    @Autowired
    private final TrapCardRepository trapCardRepository;
    private final MonsterCardMapper monsterCardMapper;
    private final SpellCardMapper spellCardMapper;
    private final TrapCardMapper trappCardMapper;

    public CardService(MonsterCardRepository monsterCardRepository, SpellCardRepository spellCardRepository,
                       TrapCardRepository trapCardRepository, MonsterCardMapper monsterCardMapper,
                       SpellCardMapper spellCardMapper, TrapCardMapper trapCardMapper) {

        this.monsterCardRepository = monsterCardRepository;
        this.spellCardRepository = spellCardRepository;
        this.trapCardRepository = trapCardRepository;
        this.monsterCardMapper = monsterCardMapper;
        this.spellCardMapper = spellCardMapper;
        this.trappCardMapper = trapCardMapper;
    }

    public MonsterCard getMonsterCardByName(String name) {
        return null;
    }

    public MonsterCardEntity createMonsterCard(MonsterCard monsterCard) {
        MonsterCardEntity monsterCardEntity = monsterCardMapper.toMonsterCardEntity(monsterCard);
        return monsterCardRepository.save(monsterCardEntity);
    }

    public SpellCardEntity createSpellCard(SpellCard spellCard ) {
        SpellCardEntity spellCardEntity = spellCardMapper.toSpellCardEntity(spellCard);
        return spellCardRepository.save(spellCardEntity);
    }

    public TrapCardEntity createTrapCard(TrapCard trapCard) {
        TrapCardEntity trapCardEntity = trappCardMapper.toTrapCardEntity(trapCard);
        return trapCardRepository.save(trapCardEntity);
    }

    public MonsterCardEntity getRandomMonsterCard() {
        Long dataTableSize = monsterCardRepository.count();
        Random random = new Random();
        Long selectedId = random.nextLong(1,(dataTableSize+1));
        return monsterCardRepository.findById(selectedId).orElse(null);
    }
}
