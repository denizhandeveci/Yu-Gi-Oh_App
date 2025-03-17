package com.Yu_Gi_Oh_App.duel_simulator.repositories;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterCardRepository extends JpaRepository<MonsterCardEntity,Long> {


        @Modifying
        @Transactional
        @Query(value = "CREATE TEMPORARY TABLE temp_ids AS " +
                "SELECT id, ROW_NUMBER() OVER (ORDER BY id) AS new_id " +
                "FROM monster_cards", nativeQuery = true)
        void createTempTable();

        @Modifying
        @Transactional
        @Query(value = "UPDATE monster_cards AS m " +
                "JOIN temp_ids AS t ON m.id = t.id " +
                "SET m.id = t.new_id", nativeQuery = true)
        void updateMonsterCardIds();

        @Modifying
        @Transactional
        @Query(value = "DROP TEMPORARY TABLE temp_ids", nativeQuery = true)
        void dropTempTable();
    }


