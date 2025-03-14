package com.Yu_Gi_Oh_App.duel_simulator.entities.cards;

import com.Yu_Gi_Oh_App.duel_simulator.enums.CardType;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "card_content", nullable = false)
    private String cardContent;
    // Prevent duplication by making this column read-only
    @Enumerated(EnumType.STRING)
    @Column(name = "card_type", nullable = false)
    private CardType cardType;

    public CardEntity(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardContent() {
        return cardContent;
    }

    public void setCardContent(String cardContent) {
        this.cardContent = cardContent;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
