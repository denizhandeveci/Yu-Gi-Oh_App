package com.Yu_Gi_Oh_App.duel_simulator.controllers;

import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Deck;
import com.Yu_Gi_Oh_App.duel_simulator.services.DeckService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deck-api")
public class DeckController {
    private final DeckService deckService;
    public DeckController(DeckService deckService) {
        this.deckService = deckService;
    }

    @PostMapping("/create-deck")
    public ResponseEntity<Deck> createDeck(@PathVariable String deckName) {
        return ResponseEntity.ok(deckService.createDeck(deckName));
    }
}
