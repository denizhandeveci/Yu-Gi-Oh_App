package com.Yu_Gi_Oh_App.duel_simulator.entities.deck;

import com.Yu_Gi_Oh_App.duel_simulator.entities.parents.Card;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "decks")
public class DeckEntity {
    @Id
    private Long id;
    private Card card;
}
