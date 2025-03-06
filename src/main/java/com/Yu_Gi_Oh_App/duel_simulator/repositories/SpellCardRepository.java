package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellCardRepository extends JpaRepository<SpellCardEntity,String> {
}
