package com.Yu_Gi_Oh_App.duel_simulator.game_logic.card;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;

public class SpellCard extends Card {
    private String spellName;

    public SpellCard() {

    }

    public SpellCard(String name, String cardContent, CardType cardType, String spellName) {
        this.spellName = spellName;
        super.setCardContent(cardContent);
        super.setCardType(cardType);
        super.setName(name);
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    @Override
    public void setCardType(CardType cardType) {
        super.setCardType(cardType);
    }

    @Override
    public CardType getCardType() {
        return super.getCardType();
    }

    @Override
    public void setCardContent(String cardContent) {
        super.setCardContent(cardContent);
    }

    @Override
    public String getCardContent() {
        return super.getCardContent();
    }

    @Override
    public void setIsAlive(boolean isAlive) {
        super.setIsAlive(isAlive);
    }

    @Override
    public boolean getIsAlive() {
        return super.getIsAlive();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void activateEffect() {

    }
}
