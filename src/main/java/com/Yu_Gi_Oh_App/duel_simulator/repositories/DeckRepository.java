package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<DeckEntity, Long> {
}
