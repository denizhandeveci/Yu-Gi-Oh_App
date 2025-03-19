package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface SpellCardRepository extends JpaRepository<SpellCardEntity,Long> {

    @Query("SELECT m.id FROM SpellCardEntity m")
    List<Long> findAllIds();
}
