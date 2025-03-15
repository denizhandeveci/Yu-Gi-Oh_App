package com.Yu_Gi_Oh_App.duel_simulator.game_logic;

import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Player {

    private String userName;
    private Deck deck;

    public Player(){

    }


    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public String getPlayerName() {
        return userName;
    }

    public void setPlayerName(String userName) {
        this.userName = userName;
    }
}
