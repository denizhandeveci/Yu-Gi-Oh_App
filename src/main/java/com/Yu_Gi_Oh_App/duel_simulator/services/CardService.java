package com.Yu_Gi_Oh_App.duel_simulator.services;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.mappers.MonsterCardMapper;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.MonsterCardRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

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

    public MonsterCardEntity getRandomMonsterCard() {
        Long dataTableSize = monsterCardRepository.count();
        Random random = new Random();
        Long selectedId = random.nextLong(1,(dataTableSize+1));
        return monsterCardRepository.findById(selectedId).orElse(null);
    }
}
