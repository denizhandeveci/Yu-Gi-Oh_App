package com.Yu_Gi_Oh_App.duel_simulator.controllers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.services.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card-api")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/create-monster-card")
    public ResponseEntity<MonsterCardEntity> createMonsterCard(@RequestBody MonsterCard monsterCard) {
        return ResponseEntity.ok(cardService.createMonsterCard(monsterCard));
    }
    @GetMapping("/get-random-monster-card")
    public ResponseEntity<MonsterCardEntity> getRandomMonsterCard() {
        return ResponseEntity.ok(cardService.getRandomMonsterCard());
    }
}
