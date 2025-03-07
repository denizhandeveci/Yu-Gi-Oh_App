package com.Yu_Gi_Oh_App.duel_simulator.game_logic;

import com.Yu_Gi_Oh_App.duel_simulator.enums.Game_Phases;
import com.Yu_Gi_Oh_App.duel_simulator.enums.PlayerTurn;

public class Game {
    private Player player1;
    private Player player2;
    private PlayerTurn playerTurn;
    private Game_Phases gamePhase;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.playerTurn = PlayerTurn.PLAYER1_TURN;
        this.gamePhase = Game_Phases.START_PHASE;
    }


}
