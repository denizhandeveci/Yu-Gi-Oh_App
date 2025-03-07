package com.Yu_Gi_Oh_App.duel_simulator.entities.cards;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CardEntity {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "is_alive")
    private boolean isAlive;
    @Column(name = "in_grave_yard")
    private boolean inGraveYard;
    @Column(name = "card_content")
    private String cardContent;
    @Column(name = "card_type")
    private CardType cardType;


    public CardEntity(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isInGraveYard() {
        return inGraveYard;
    }

    public void setInGraveYard(boolean inGraveYard) {
        this.inGraveYard = inGraveYard;
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
