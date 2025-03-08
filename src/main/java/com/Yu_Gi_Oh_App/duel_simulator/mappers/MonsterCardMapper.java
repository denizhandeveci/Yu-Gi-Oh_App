package com.Yu_Gi_Oh_App.duel_simulator.mappers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.enums.CardPosition;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class MonsterCardMapper {

    // Converts a MonsterCardEntity to a MonsterCard
    public MonsterCard toMonsterCard(MonsterCardEntity entity) {
        MonsterCard card = new MonsterCard();

        // Map the properties from MonsterCardEntity to MonsterCard
        card.setName(entity.getName());
        card.setCardContent(entity.getCardContent());
        card.setCardType(entity.getCardType());

        // Set attack and defense
        card.setAttackPoints(entity.getAttack());
        card.setDefensePoints(entity.getDefense());

        // Default position (you can customize this if needed)
        card.setCardPosition(CardPosition.ATTACK_POSITION);

        return card;
    }

    // Converts a MonsterCard to a MonsterCardEntity (for saving to the database)
    public MonsterCardEntity toMonsterCardEntity(MonsterCard card) {
        MonsterCardEntity entity = new MonsterCardEntity();

        // Map the properties from MonsterCard to MonsterCardEntity
        entity.setName(card.getName());
        entity.setCardContent(card.getCardContent());
        entity.setCardType(card.getCardType());

        // Set attack and defense
        entity.setAttack(card.getAttackPoints());
        entity.setDefense(card.getDefensePoints());

        return entity;
    }
}
