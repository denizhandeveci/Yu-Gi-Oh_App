package com.Yu_Gi_Oh_App.duel_simulator.entities.deck;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.player.PlayerEntity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "deckentity")
public class DeckEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "deck_name")
    private String deckName;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    @ManyToMany
    @JoinTable(
            name = "deck_cards",
            joinColumns = @JoinColumn(name = "deck_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private List<MonsterCardEntity> monsterCardsDeck;

    @ManyToMany
    @JoinTable(
            name = "deck_cards",
            joinColumns = @JoinColumn(name = "deck_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private List<TrapCardEntity> trapCardsDeck;

    @ManyToMany
    @JoinTable(
            name = "deck_cards",
            joinColumns = @JoinColumn(name = "deck_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private List<SpellCardEntity> spellCardsDeck;

    public DeckEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    public void setPlayer(PlayerEntity player) {
        this.player = player;
    }

    public List<MonsterCardEntity> getMonsterCardsDeck() {
        return monsterCardsDeck;
    }

    public void setMonsterCardsDeck(List<MonsterCardEntity> monsterCardsDeck) {
        this.monsterCardsDeck = monsterCardsDeck;
    }

    public List<TrapCardEntity> getTrapCardsDeck() {
        return trapCardsDeck;
    }

    public void setTrapCardsDeck(List<TrapCardEntity> trapCardsDeck) {
        this.trapCardsDeck = trapCardsDeck;
    }

    public List<SpellCardEntity> getSpellCardsDeck() {
        return spellCardsDeck;
    }

    public void setSpellCardsDeck(List<SpellCardEntity> spellCardsDeck) {
        this.spellCardsDeck = spellCardsDeck;
    }
}
