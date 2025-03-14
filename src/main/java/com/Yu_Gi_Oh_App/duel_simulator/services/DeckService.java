package com.Yu_Gi_Oh_App.duel_simulator.services;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.CardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Deck;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.Card;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.MonsterCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.SpellCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.TrapCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.DeckRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.MonsterCardRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.SpellCardRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.TrapCardRepository;
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

    public DeckService(DeckRepository deckRepository, MonsterCardRepository monsterCardRepository,
                       TrapCardRepository trapCardRepository, SpellCardRepository spellCardRepository,
                       MonsterCardMapper monsterCardMapper, TrapCardMapper trapCardMapper, SpellCardMapper spellCardMapper) {
        this.deckRepository = deckRepository;
        this.monsterCardRepository = monsterCardRepository;
        this.trapCardRepository = trapCardRepository;
        this.spellCardRepository = spellCardRepository;
        this.monsterCardMapper = monsterCardMapper;
        this.trapCardMapper = trapCardMapper;
        this.spellCardMapper = spellCardMapper;
    }

    public Deck createDeck(String deckName) {
        Deck deck = new Deck();
        List<Card> cardList = new ArrayList<>();
        Random randomCardNumber = new Random();
        for(int i = 0; i < 10; i++) {
            int selectedCardType = randomCardNumber.nextInt(0,3);
            Long selectedCardId = randomCardNumber.nextLong(1,11);
            switch (selectedCardType){
                case 0 -> cardList.add(monsterCardMapper.toMonsterCard(monsterCardRepository.findById(selectedCardId).orElseThrow()));
                case 1 -> cardList.add(spellCardMapper.toSpellCard(spellCardRepository.findById(selectedCardId).orElseThrow()));
                case 2 -> cardList.add(trapCardMapper.toTrapCard(trapCardRepository.findById(selectedCardId).orElseThrow()));
            }
        }
        deck.setDeck(cardList);
        deck.setDeckName(deckName);
        return null; //deckRepository.save(deck);
    }
}
