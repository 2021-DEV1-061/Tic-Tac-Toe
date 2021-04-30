package com.game.tictoctoe.service.impl;

import com.game.tictoctoe.model.Game;
import com.game.tictoctoe.model.Player;
import com.game.tictoctoe.service.GameService;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private Game game;

    /** 
     * A game will be intialized by default
     * 
     */
    public GameServiceImpl() {
        this.game = new Game();
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

  

}