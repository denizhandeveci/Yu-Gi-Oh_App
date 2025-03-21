package com.Yu_Gi_Oh_App.duel_simulator.entities.cards;

import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="monster_cards")
public class MonsterCardEntity extends CardEntity {
    @Column(name="attack")
    private int attackPoints;
    @Column(name="defense")
    private int defensePoints;



    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

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

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attack) {
        this.attackPoints = attack;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defense) {
        this.defensePoints = defense;
    }

}
