package com.Yu_Gi_Oh_App.duel_simulator.services;


import com.Yu_Gi_Oh_App.duel_simulator.entities.deck.DeckEntity;
import com.Yu_Gi_Oh_App.duel_simulator.entities.player.PlayerEntity;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.DeckRepository;
import com.Yu_Gi_Oh_App.duel_simulator.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private final DeckRepository deckRepository;
    @Autowired
    private final PlayerRepository playerRepository;
    private final DeckService deckService;

    public PlayerService(DeckRepository deckRepository, PlayerRepository playerRepository, DeckService deckService) {
        this.deckRepository = deckRepository;
        this.playerRepository = playerRepository;
        this.deckService = deckService;
    }

    public PlayerEntity createPlayer(String userName) {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setUserName(userName);
        return playerRepository.save(playerEntity);
    }

}
