package com.Yu_Gi_Oh_App.duel_simulator.entities.cards;

import com.Yu_Gi_Oh_App.duel_simulator.entities.parents.Card;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "spell_card")
public class SpellCardEntity extends Card {


    public SpellCardEntity() {

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
