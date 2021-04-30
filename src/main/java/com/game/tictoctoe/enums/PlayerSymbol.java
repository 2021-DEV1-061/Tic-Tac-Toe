package com.game.tictoctoe.enums;

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