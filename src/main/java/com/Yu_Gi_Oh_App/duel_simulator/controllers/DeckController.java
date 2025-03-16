package com.Yu_Gi_Oh_App.duel_simulator.controllers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Deck;
import com.Yu_Gi_Oh_App.duel_simulator.services.DeckService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deck-api")
public class DeckController {
    private final DeckService deckService;
    public DeckController(DeckService deckService) {
        this.deckService = deckService;
    }

    @PostMapping("/create-deck/{deckName}/{playerID}")
    public ResponseEntity<DeckEntity> createDeck(@PathVariable String deckName, @PathVariable Long playerID) {
        return ResponseEntity.ok(deckService.createDeck(deckName, playerID));
    }

}
