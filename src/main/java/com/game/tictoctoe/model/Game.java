package com.game.tictoctoe.model;

import com.game.tictoctoe.exception.FirstPlayerException;
import com.game.tictoctoe.exception.MarkerAlreadyOccupied;
import com.game.tictoctoe.exception.MarkerOutsideBoardException;
import com.game.tictoctoe.exception.NextPlayerNotDifferentException;
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

        currentPlayer = null;
    }

    /**
     * play with choose xPosition,yPosition in matrix [xPosition and yPosition are  in {1,2,3} ] 
     * check if first player is with X symbol
     * check if next player is different to the previous
     * 
     * @param xPosition
     * @param yPosition
     */
    public void play(int xPosition, int yPosition, Player player) {

        checkFirstPlayer(player);
        checkNextPlayer(player);
        checkMarkerBoardPosition(xPosition, yPosition);
        fillUpBoard(xPosition, yPosition, player);

    }

    /**
     * check if the marker position in the borad is not occupied
     * 
     * @param xPosition
     * @param yPosition
     */
    private void fillUpBoard(int xPosition, int yPosition, Player player) {

        currentPlayer = player;

        BoardMarker[][] marker = board.getBoardMarkers();

        if (!marker[xPosition - 1][yPosition - 1].isEmpty()) {

            throw new MarkerAlreadyOccupied();

        }

        // update borad with the new marker
        board.getBoardMarkers()[xPosition - 1][yPosition - 1]
                .setValue(MarkerValue.valueOf(currentPlayer.getPlayerSymbol().getSymbol()));

        // next player should be different
        currentPlayer = nextPlayer();

    }

    public void checkMarkerBoardPosition(int xPosition, int yPosition) {

        if (xPosition < 1 || xPosition > 3 || yPosition < 1 || yPosition > 3) {
            throw new MarkerOutsideBoardException();
        }

    }

    public void checkFirstPlayer(Player player) {

        if(currentPlayer==null && !player.getPlayerSymbol().equals(PlayerSymbol.PLAYER_X)){


            throw new FirstPlayerException();


        }

    }

    public void checkNextPlayer(Player player) {

        if (currentPlayer!=null && !currentPlayer.getPlayerSymbol().equals(player.getPlayerSymbol())) {

            throw new NextPlayerNotDifferentException("Next player shouled be " + player.getPlayerSymbol().getSymbol());

        }

    }

    public Player nextPlayer() {

        if (currentPlayer.getPlayerSymbol().equals(PlayerSymbol.PLAYER_X)) {

            return playerO;

        }
        return playerX;
    }


    

}