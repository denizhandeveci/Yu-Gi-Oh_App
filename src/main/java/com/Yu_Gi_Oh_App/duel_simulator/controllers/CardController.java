package com.Yu_Gi_Oh_App.duel_simulator.controllers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.MonsterCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.SpellCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.cards.TrapCardEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.MonsterCard;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.SpellCard;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.card.TrapCard;
import com.Yu_Gi_Oh_App.duel_simulator.services.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/create-monster-card-list")
    public ResponseEntity<List<MonsterCardEntity>> createMonsterCardList(@RequestBody List<MonsterCard> monsterCards){
        return ResponseEntity.ok(cardService.createMonsterCardList(monsterCards));
    }
    @GetMapping("/get-monster-card/{id}")
    public ResponseEntity<MonsterCardEntity> getMonsterCardById(@PathVariable Long id){
        return ResponseEntity.ok(cardService.getMonsterCardById(id));
    }
    @DeleteMapping("/delete-monster-card/{id}")
    public String deleteMonsterCardById(@PathVariable Long id){
        return cardService.deleteMonsterCardById(id);
    }

    @GetMapping("/sort-monster-card-ids")
    public void sortMonsterCardIds(){
        cardService.updateMonsterCardIdsSafely();
    }


    @PostMapping("create-spell-card")
    public ResponseEntity<SpellCardEntity> createSpellCard(@RequestBody SpellCard spellCard) {
        return ResponseEntity.ok(cardService.createSpellCard(spellCard));
    }

    @PostMapping("create-trap-card")
    public ResponseEntity<TrapCardEntity> createTrapCard(@RequestBody TrapCard trapCard) {
        return ResponseEntity.ok(cardService.createTrapCard(trapCard));
    }

    @GetMapping("/get-random-monster-card")
    public ResponseEntity<MonsterCardEntity> getRandomMonsterCard() {
        return ResponseEntity.ok(cardService.getRandomMonsterCard());
    }

    @GetMapping("/get-random-spell-card")
    public ResponseEntity<SpellCardEntity> getRandomSpellCard() {
        return ResponseEntity.ok(cardService.getRandomSpellCard());
    }

    @GetMapping("/get-random-trap-card")
    public ResponseEntity<TrapCardEntity> getRandomTrapCard() {
        return ResponseEntity.ok(cardService.getRandomTrapCard());
    }

}
