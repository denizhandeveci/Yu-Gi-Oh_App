package com.Yu_Gi_Oh_App.duel_simulator.game_logic.card;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;

public class TrapCard extends Card {

    //trap card spell name
    private String trapName;

    public TrapCard() {

    }

    public TrapCard(String name, CardType cardType, String cardContent,String trapName ) {
        this.trapName = trapName;
        super.setCardType(cardType);
        super.setCardContent(cardContent);
        super.setName(name);
    }

    public String getTrapName() {
        return trapName;
    }

    public void setTrapName(String trapName) {
        this.trapName = trapName;
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
    public boolean getIsAlive() {
        return super.getIsAlive();
    }

    @Override
    public void setIsAlive(boolean isAlive) {
        super.setIsAlive(isAlive);
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
