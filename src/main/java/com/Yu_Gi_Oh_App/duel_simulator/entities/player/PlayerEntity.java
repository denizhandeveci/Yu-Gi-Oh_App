package com.Yu_Gi_Oh_App.duel_simulator.entities.player;

import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "playerentity")
public class PlayerEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DeckEntity> decks;

}
