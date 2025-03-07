package com.Yu_Gi_Oh_App.duel_simulator.entities.game_logic;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardPosition;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;

public class MonsterCard extends Card {
    private int attackPoints;
    private int defensePoints;
    private CardPosition cardPosition;

    public MonsterCard() {

    }


    public int attack(MonsterCard target){
        int lifePoints = 0;
        if(target.cardPosition == CardPosition.ATTACK_POSITION){
            if(this.attackPoints > target.attackPoints){
                target.setIsAlive(false);
                lifePoints += target.attackPoints - this.attackPoints;
            }else if(this.attackPoints < target.attackPoints){
                this.setIsAlive(false);
                lifePoints = this.attackPoints - target.attackPoints;
            }else{
                this.setIsAlive(false);
                target.setIsAlive(false);
                lifePoints =0;
            }
        }else if(target.cardPosition == CardPosition.DEFENSE_POSITION){
            if(this.attackPoints > target.defensePoints){
                target.setIsAlive(false);
                lifePoints = 0;
            }else if(this.attackPoints < target.defensePoints){
                this.setIsAlive(true);
                target.setIsAlive(true);
                lifePoints = this.attackPoints - target.defensePoints;

            }else{
                this.setIsAlive(true);
                target.setIsAlive(true);
            }
        }
        return lifePoints;

    }

    public int getAttack() {
        return attackPoints;
    }

    public void setAttack(int attack) {
        this.attackPoints = attack;
    }

    public int getDefense() {
        return defensePoints;
    }

    public void setDefense(int defense) {
        this.defensePoints = defense;
    }

    public CardPosition getCardPosition() {
        return cardPosition;
    }

    public void setCardPosition(CardPosition cardPosition) {
        this.cardPosition = cardPosition;
    }

    @Override
    public void activateEffect() {

    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
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
}
