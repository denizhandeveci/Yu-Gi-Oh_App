package com.Yu_Gi_Oh_App.duel_simulator.entities.cards;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "spell_cards")
public class SpellCardEntity extends CardEntity {
    @Column(name = "spell_name")
    private String spellName;

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public SpellCardEntity() {

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
