package com.Yu_Gi_Oh_App.duel_simulator.controllers;

import com.Yu_Gi_Oh_App.duel_simulator.entities.player.PlayerEntity;
import com.Yu_Gi_Oh_App.duel_simulator.game_logic.Player;
import com.Yu_Gi_Oh_App.duel_simulator.services.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player-api")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/create-player/{userName}")
    public ResponseEntity<PlayerEntity> createPlayer(@PathVariable String userName ){
        return ResponseEntity.ok(playerService.createPlayer(userName));
    }

}
