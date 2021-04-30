package com.game.tictoctoe.model;

import java.util.ArrayList;
import java.util.List;

import com.game.tictoctoe.enums.GameStatus;
import com.game.tictoctoe.enums.MarkerValue;
import com.game.tictoctoe.enums.PlayerSymbol;
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
    private GameStatus gameStatus = GameStatus.INPROGRESS;

    // list of players ordered
    List<Movement> movements = new ArrayList<>();

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

    /**
     * play with choose xPosition,yPosition in matrix [xPosition and yPosition are
     * in {1,2,3} ] check if first player is with X symbol check if next player is
     * different to the previous
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

        BoardMarker[][] marker = board.getBoardMarkers();

        if (!marker[xPosition - 1][yPosition - 1].isEmpty()) {

            throw new MarkerAlreadyOccupied();

        }

        // update borad with the new marker
        board.getBoardMarkers()[xPosition - 1][yPosition - 1]
                .setValue(MarkerValue.valueOf(player.getPlayerSymbol().getSymbol()));

        // update the list of players movements
        movements.add(new Movement(player));

    }

    public void checkMarkerBoardPosition(int xPosition, int yPosition) {

        if (xPosition < 1 || xPosition > 3 || yPosition < 1 || yPosition > 3) {
            throw new MarkerOutsideBoardException();
        }

    }

    public void checkFirstPlayer(Player player) {

        if (movements.isEmpty() && !player.getPlayerSymbol().equals(PlayerSymbol.PLAYER_X)) {
            throw new FirstPlayerException();
        }

    }

    // Compare current playerwith last player in movement list
    public void checkNextPlayer(Player player) {

        if (!movements.isEmpty() && movements.get(movements.size() - 1).getPlayer().getPlayerSymbol()
                .equals(player.getPlayerSymbol())) {

            throw new NextPlayerNotDifferentException("Next player shouled be " + player.getPlayerSymbol().getSymbol());

        }

    }

    /**
     * check player result
     * 
     * @param player
     */
    public void checkPlayerResult(Player player) {

    }

}