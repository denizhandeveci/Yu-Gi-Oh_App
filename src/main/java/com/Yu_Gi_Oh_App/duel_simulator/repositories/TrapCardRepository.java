package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrapCardRepository extends JpaRepository<TrapCardEntity,Long> {

    @Query("SELECT m.id FROM TrapCardEntity m")
    List<Long> findAllIds();
}
