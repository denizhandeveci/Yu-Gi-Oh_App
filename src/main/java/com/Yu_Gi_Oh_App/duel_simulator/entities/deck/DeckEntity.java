package com.Yu_Gi_Oh_App.duel_simulator.entities.deck;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.CardEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "decks")
public class DeckEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @OneToMany
    @JoinColumn(name = "card_id")
    private List<CardEntity> deckName;

}
