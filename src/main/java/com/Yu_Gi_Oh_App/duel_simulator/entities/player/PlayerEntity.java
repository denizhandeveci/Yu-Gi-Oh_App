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
    @Column(name = "user_name", nullable = false)
    private String userName;
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DeckEntity> decks;

    public PlayerEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<DeckEntity> getDecks() {
        return decks;
    }

    public void setDecks(List<DeckEntity> decks) {
        this.decks = decks;
    }
}
