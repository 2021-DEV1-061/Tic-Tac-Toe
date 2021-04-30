package com.game.tictoctoe.service;

import com.game.tictoctoe.model.Player;

public interface PlayerService {

    Player getPlayerBySymbol(String playerSymbol);

}