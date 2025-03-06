package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterCardRepository extends JpaRepository<MonsterCardEntity,String> {
}
