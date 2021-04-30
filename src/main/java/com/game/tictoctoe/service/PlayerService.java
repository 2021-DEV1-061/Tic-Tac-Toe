package com.game.tictoctoe.service;

import com.game.tictoctoe.model.Player;

import org.springframework.stereotype.Service;

@Service
public interface PlayerService {

    Player getPlayerBySymbol(String playerSymbol);

}