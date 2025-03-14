package com.Yu_Gi_Oh_App.duel_simulator.mappers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.Card;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.SpellCard;
import org.springframework.stereotype.Component;

@Component
public class SpellCardMapper {

    public SpellCard toSpellCard(SpellCardEntity spellCardEntity) {
        SpellCard spellCard = new SpellCard();
        spellCard.setName(spellCardEntity.getName());
        spellCard.setCardContent(spellCardEntity.getCardContent());
        spellCard.setCardType(spellCardEntity.getCardType());
        spellCard.setSpellName(spellCardEntity.getSpellName());
        return spellCard;
    }

    public SpellCardEntity toSpellCardEntity(SpellCard spellCard) {
        SpellCardEntity spellCardEntity = new SpellCardEntity();
        spellCardEntity.setName(spellCard.getName());
        spellCardEntity.setCardContent(spellCard.getCardContent());
        spellCardEntity.setCardType(spellCard.getCardType());
        spellCardEntity.setSpellName(spellCard.getSpellName());
        return spellCardEntity;
    }

}
