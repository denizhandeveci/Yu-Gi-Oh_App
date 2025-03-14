package com.Yu_Gi_Oh_App.duel_simulator.mappers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.CardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Deck;
import org.springframework.stereotype.Component;

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
       // deckEntity.setCards(deck.getDeck());
        return deckEntity;
    }
}
