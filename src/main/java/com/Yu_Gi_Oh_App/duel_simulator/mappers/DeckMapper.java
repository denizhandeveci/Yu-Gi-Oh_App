package com.Yu_Gi_Oh_App.duel_simulator.mappers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.CardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Deck;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.Card;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeckMapper {

    public Deck toDeck(DeckEntity deckEntity) {
        Deck deck = new Deck();
        deck.setDeckName(deckEntity.getDeckName());

        return deck;
    }

    public DeckEntity toDeckEntity(Deck deck) {
        DeckEntity deckEntity = new DeckEntity();
        deckEntity.setDeckName(deck.getDeckName());
        List<MonsterCardEntity> monsterCardEntities = new ArrayList<>();
        List<SpellCardEntity> spellCardEntities = new ArrayList<>();
        List<TrapCardEntity> trapCardEntities = new ArrayList<>();

        for(Card card : deck.getDeck()){
            if(card.getCardType().equals(CardType.MONSTER_CARD)){

            }
            if(card.getCardType().equals(CardType.SPELL_CARD)){

            }
            else{

            }

        }
       // deckEntity.setCards(deck.getDeck());
        return deckEntity;
    }
}
