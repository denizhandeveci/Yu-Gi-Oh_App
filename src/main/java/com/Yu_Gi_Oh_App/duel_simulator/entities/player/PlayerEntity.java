package com.Yu_Gi_Oh_App.duel_simulator.entities.player;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class PlayerEntity {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

}
