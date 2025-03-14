package com.Yu_Gi_Oh_App.duel_simulator.game_logic;

import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Deck {
  //  private Long id;
    private String deckName;
    private List<Card> deck;

    public Deck(List<Card> deck, String deckName) {
        this.deck = deck;
        this.deckName = deckName;
    }

    public Deck() {

    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
