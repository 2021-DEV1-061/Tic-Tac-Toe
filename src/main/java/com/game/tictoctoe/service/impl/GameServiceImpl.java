package com.game.tictoctoe.service.impl;

import com.game.tictoctoe.model.Game;
import com.game.tictoctoe.model.Player;
import com.game.tictoctoe.service.GameService;


public class GameServiceImpl implements GameService {

    private Game game;

    public GameServiceImpl(Game game) {

        this.game = game;

    }

    
    /** 
     * @param xPosition
     * @param yPosition
     * @param player
     */
    @Override
    public Game play(int xPosition, int yPosition, Player player) {
        this.game.play(xPosition, yPosition, player);
        return this.game;
    }

    @Override
    public Game restart() {
        this.game.initialize();
        return this.game;
    }

}