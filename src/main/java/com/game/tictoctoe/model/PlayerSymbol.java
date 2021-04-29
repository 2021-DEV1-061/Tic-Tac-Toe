package com.game.tictoctoe.model;

import lombok.Getter;

@Getter
public enum PlayerSymbol {

    PLAYER_X("X"),
    PLAYER_O("O");

    private final String symbol;

    PlayerSymbol(String symbol){
        this.symbol=symbol;
    }


}