package com.Yu_Gi_Oh_App.duel_simulator.mappers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.Card;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.TrapCard;
import org.springframework.stereotype.Component;

@Component
public class TrapCardMapper {
    public TrapCard toTrapCard(TrapCardEntity trapCardEntity) {
        TrapCard trapCard = new TrapCard();
        trapCard.setName(trapCardEntity.getName());
        trapCard.setCardContent(trapCardEntity.getCardContent());
        trapCard.setCardType(trapCardEntity.getCardType());
        trapCard.setTrapName(trapCardEntity.getTrapName());
        return trapCard;
    }

    public TrapCardEntity toTrapCardEntity(TrapCard trapCard) {
        TrapCardEntity trapCardEntity = new TrapCardEntity();
        trapCardEntity.setCardContent(trapCard.getCardContent());
        trapCardEntity.setCardType(trapCard.getCardType());
        trapCardEntity.setTrapName(trapCard.getTrapName());
        trapCardEntity.setName(trapCard.getName());
        return trapCardEntity;
    }
}
