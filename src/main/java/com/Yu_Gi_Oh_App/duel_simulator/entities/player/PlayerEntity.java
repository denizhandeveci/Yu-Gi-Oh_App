package com.Yu_Gi_Oh_App.duel_simulator.entities.player;

import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "players")
public class PlayerEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @OneToMany
    @JoinColumn(name = "deck_id")
    private List<DeckEntity> deck;

}
