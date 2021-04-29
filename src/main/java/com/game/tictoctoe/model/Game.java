package com.game.tictoctoe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

    private Board board;
    private Player playerX;
    private Player playerO;

    public Game() {

        initialize();

    }

    private void initialize() {

        if (board == null) {
            board = new Board();
        } else {
            board.reset();
        }
    }

}