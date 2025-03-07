package com.Yu_Gi_Oh_App.duel_simulator.services;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.MonsterCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.MonsterCardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    private final MonsterCardRepository monsterCardRepository;
    private final MonsterCardMapper monsterCardMapper;

    public CardService(MonsterCardRepository monsterCardRepository, MonsterCardMapper monsterCardMapper) {
        this.monsterCardRepository = monsterCardRepository;
        this.monsterCardMapper = monsterCardMapper;
    }

    public MonsterCard getMonsterCardByName(String name) {
        return null;
    }

    public MonsterCardEntity createMonsterCard(MonsterCard monsterCard) {
        MonsterCardEntity monsterCardEntity = monsterCardMapper.toMonsterCardEntity(monsterCard);
        return monsterCardRepository.save(monsterCardEntity);
    }
}
