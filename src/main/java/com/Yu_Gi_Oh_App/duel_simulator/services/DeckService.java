package com.Yu_Gi_Oh_App.duel_simulator.services;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.CardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.player.PlayerEntity;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.MonsterCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.SpellCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.TrapCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class DeckService {
    private final DeckRepository deckRepository;
    private final MonsterCardRepository monsterCardRepository;
    private final TrapCardRepository trapCardRepository;
    private final SpellCardRepository spellCardRepository;
    private final MonsterCardMapper monsterCardMapper;
    private final TrapCardMapper trapCardMapper;
    private final SpellCardMapper spellCardMapper;
    private final PlayerRepository playerRepository;

    public DeckService(DeckRepository deckRepository, MonsterCardRepository monsterCardRepository,
                       TrapCardRepository trapCardRepository, SpellCardRepository spellCardRepository,
                       MonsterCardMapper monsterCardMapper, TrapCardMapper trapCardMapper, SpellCardMapper spellCardMapper, PlayerRepository playerRepository) {
        this.deckRepository = deckRepository;
        this.monsterCardRepository = monsterCardRepository;
        this.trapCardRepository = trapCardRepository;
        this.spellCardRepository = spellCardRepository;
        this.monsterCardMapper = monsterCardMapper;
        this.trapCardMapper = trapCardMapper;
        this.spellCardMapper = spellCardMapper;
        this.playerRepository = playerRepository;
    }

    public List<DeckEntity> getDeck(List<Long> deckId) {
        List<DeckEntity> deckEntityList = new ArrayList<>();
        for (Long id : deckId) {
            deckEntityList.add(deckRepository.findById(id).orElseThrow());
        }
        return deckEntityList;
    }

//    public DeckEntity updatePlayerDeck(Long deckID, Long playerID){
//        DeckEntity deckEntity = deckRepository.findById(deckID).orElseThrow();
//        PlayerEntity playerEntity = playerRepository.findById(playerID).orElseThrow();
//        deckEntity.setPlayer(playerEntity);
//
//        return null;
//    }

    public DeckEntity createDeck(String deckName, Long playerID) {
        DeckEntity deckEntity = new DeckEntity();
        List<CardEntity> cardList = new ArrayList<>();
        Random randomCardNumber = new Random();
        for (int i = 0; i < 10; i++) {
            int selectedCardType = randomCardNumber.nextInt(0, 3);
            Long selectedCardId = randomCardNumber.nextLong(1, 11);
            switch (selectedCardType) {
                case 0 -> cardList.add(monsterCardRepository.findById(selectedCardId).orElseThrow());
                case 1 -> cardList.add((spellCardRepository.findById(selectedCardId).orElseThrow()));
                case 2 -> cardList.add((trapCardRepository.findById(selectedCardId).orElseThrow()));
            }
        }

        List<MonsterCardEntity> monsterCardEntities = new ArrayList<>();
        List<SpellCardEntity> spellCardEntities = new ArrayList<>();
        List<TrapCardEntity> trapCardEntities = new ArrayList<>();

        for (CardEntity card : cardList) {
            if (card.getCardType().equals(CardType.MONSTER_CARD)) {
                monsterCardEntities.add((MonsterCardEntity) card);
            } else if (card.getCardType().equals(CardType.SPELL_CARD)) {
                spellCardEntities.add((SpellCardEntity) card);
            } else {
                trapCardEntities.add((TrapCardEntity) card);
            }
        }

        deckEntity.setDeckName(deckName);
        PlayerEntity playerEntity = playerRepository.getReferenceById(playerID);
        deckEntity.setPlayer(playerEntity);
        deckEntity.setMonsterCardsDeck(monsterCardEntities);
        deckEntity.setSpellCardsDeck(spellCardEntities);
        deckEntity.setTrapCardsDeck(trapCardEntities);
        return deckRepository.save(deckEntity);
    }

}
