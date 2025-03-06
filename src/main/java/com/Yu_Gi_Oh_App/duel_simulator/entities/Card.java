package com.Yu_Gi_Oh_App.duel_simulator.entities;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

public class Card {
    private String name;
    private static boolean isAlive;
    private static boolean inGraveYard;
    private String cardContent;
    private CardType cardType;


    public Card(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isIsAlive() {
        return isAlive;
    }

    public static void setIsAlive(boolean isAlive) {
        Card.isAlive = isAlive;
    }

    public static boolean isInGraveYard() {
        return inGraveYard;
    }

    public static void setInGraveYard(boolean inGraveYard) {
        Card.inGraveYard = inGraveYard;
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
