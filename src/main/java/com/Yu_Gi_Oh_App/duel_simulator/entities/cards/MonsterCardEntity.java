package com.Yu_Gi_Oh_App.duel_simulator.entities.cards;

import com.Yu_Gi_Oh_App.duel_simulator.entities.parents.Card;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardPosition;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="monster_cards")
public class MonsterCardEntity extends Card {
    @Column(name="attack")
    private int attack;
    @Column(name="defense")
    private int defense;
    @Column(name="card_position")
    private CardPosition cardPosition;

    public MonsterCardEntity(){

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCardContent() {
        return super.getCardContent();
    }

    @Override
    public void setCardContent(String cardContent) {
        super.setCardContent(cardContent);
    }

    @Override
    public CardType getCardType() {
        return super.getCardType();
    }

    @Override
    public void setCardType(CardType cardType) {
        super.setCardType(cardType);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public CardPosition getCardPosition() {
        return cardPosition;
    }

    public void setCardPosition(CardPosition cardPosition) {
        this.cardPosition = cardPosition;
    }
}
