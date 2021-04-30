package com.game.tictoctoe.enums;

import lombok.Getter;

@Getter
public enum GameStatus {
    INPROGRESS("IN POGRESS"),
    OVER("OVER"), // game over with winner
    DRAW("DRAW"); // game over without winner

    private String value;

    private GameStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}