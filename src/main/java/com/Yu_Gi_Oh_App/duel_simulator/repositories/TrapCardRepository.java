package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrapCardRepository extends JpaRepository<TrapCardEntity,String> {
}
