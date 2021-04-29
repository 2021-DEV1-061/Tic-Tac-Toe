package com.game.tictoctoe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public Game(Player playerX, Player playerO) {
        this.playerX = playerX;
        this.playerO = playerO;
        initialize();
    }

    private void initialize() {

        if (board == null) {
            board = new Board();
        } else {
            board.reset();
        }
    }

    public void play(int xPosition, int yPosition) {

        fillUpBoard(xPosition, yPosition);
    }

    private void fillUpBoard(int xPosition, int yPosition) {

        board.getBoardMarkers()[xPosition][yPosition]
                .setValue(MarkerValue.valueOf(currentPlayer.getPlayerSymbol().getSymbol()));

    }

}