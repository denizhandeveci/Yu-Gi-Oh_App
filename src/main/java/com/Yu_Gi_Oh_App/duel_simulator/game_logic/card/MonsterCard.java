package com.Yu_Gi_Oh_App.duel_simulator.game_logic.card;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardPosition;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;

public class MonsterCard extends Card {
    private int attackPoints;
    private int defensePoints;
    private CardPosition cardPosition;

    public MonsterCard() {

    }

    public MonsterCard(int attackPoints, int defensePoints, String cardContent, CardType cardType, String name) {
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        super.setCardContent(cardContent);
        super.setName(name);
        super.setCardType(cardType);
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

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
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
