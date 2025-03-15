package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.player.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
