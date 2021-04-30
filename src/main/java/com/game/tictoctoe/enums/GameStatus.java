package com.game.tictoctoe.enums;

import lombok.Getter;

@Getter
public enum GameStatus {
    INPROGRESS("IN POGRESS"),
    OVER("OVER"),
    DRAW("DRAW");

    private String value;

    private GameStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}