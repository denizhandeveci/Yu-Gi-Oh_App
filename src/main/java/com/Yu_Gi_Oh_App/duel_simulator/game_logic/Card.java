package com.Yu_Gi_Oh_App.duel_simulator.game_logic;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;

public abstract class Card {
    private Long id;
    private String name;
    private boolean isAlive;
    private String cardContent;
    private CardType cardType;

    public Card(){

    }
    // takes in Player player, Game game
    public abstract void activateEffect();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getCardContent() {
        return cardContent;
    }

    public void setCardContent(String cardContent) {
        this.cardContent = cardContent;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
