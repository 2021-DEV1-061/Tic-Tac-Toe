package com.game.tictoctoe.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.game.tictoctoe.enums.PlayerSymbol;
import com.game.tictoctoe.exception.PlayerNotFoundException;
import com.game.tictoctoe.model.Player;
import com.game.tictoctoe.service.PlayerService;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final List<Player> players;

    /** 
     * Two player will be initialized from the beginning
     * 
     */
    public PlayerServiceImpl() {
        players = new ArrayList<>(2);
        players.add(new Player("FIRST_PLAYER", PlayerSymbol.PLAYER_X));
        players.add(new Player("SECOND_PLAYER", PlayerSymbol.PLAYER_O));
    }

    
    /** 
     * @param playerSymbol
     * @return Player
     */
    @Override
    public Player getPlayerBySymbol(String playerSymbol) {

        Optional<Player> player = players.stream().filter(e -> e.getPlayerSymbol().getSymbol().equals(playerSymbol))
                .findFirst();

        if (player.isPresent()) {

            return player.get();

        }
        throw new PlayerNotFoundException("Player with Symbol "+playerSymbol+" is not found");

    }

}