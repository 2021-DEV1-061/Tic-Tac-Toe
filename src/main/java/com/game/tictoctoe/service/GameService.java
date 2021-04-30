package com.game.tictoctoe.service;

import com.game.tictoctoe.model.Game;
import com.game.tictoctoe.model.Player;
import org.springframework.stereotype.Service;

@Service
public interface GameService {

    Game play(int xPosition, int yPosition, Player player);

    Game restart();

}