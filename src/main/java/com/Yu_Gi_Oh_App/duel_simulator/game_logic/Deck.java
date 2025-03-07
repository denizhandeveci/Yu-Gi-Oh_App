package com.Yu_Gi_Oh_App.duel_simulator.game_logic;

import java.util.ArrayList;

public class Deck {
    private Long id;
    private ArrayList<Card> deck = new ArrayList<>(30);

    public Deck() {

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
