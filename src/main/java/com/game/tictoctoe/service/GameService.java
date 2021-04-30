package com.game.tictoctoe.service;

import com.game.tictoctoe.model.Game;
import com.game.tictoctoe.model.Player;

public interface GameService {

    Game play(int xPosition, int yPosition, Player player);


}