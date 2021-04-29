package com.game.tictoctoe;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.game.tictoctoe.exception.FirstPlayerException;
import com.game.tictoctoe.exception.MarkerAlreadyOccupied;
import com.game.tictoctoe.exception.MarkerOutsideBoardException;
import com.game.tictoctoe.exception.NextPlayerNotDifferentException;
import com.game.tictoctoe.model.Game;
import com.game.tictoctoe.model.Player;
import com.game.tictoctoe.model.PlayerSymbol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TictoctoeApplicationTests {

	@Test
	void contextLoads() {
	}

	private Game game;
	private Player playerX = new Player("xavi", PlayerSymbol.PLAYER_X);
	private Player playerO = new Player("eline", PlayerSymbol.PLAYER_O);

	@BeforeEach
	void init() {

		game = new Game(playerX, playerO);

	}

	@Test
	void startGamePlayersShouldBeDifferentTest() {
		assertNotEquals(game.getPlayerX(), game.getPlayerO());
	}

	@Test
	void whenStartGamePlayerXShouldStartFirstTest() {
		// game is empty
		assertThrows(FirstPlayerException.class, ()->game.play(1, 2, playerO));
	}

	@Test
	void whenMarkerBoundWasOcuppiedThenThrowsAlreadyOccupiedException() {
		game.setCurrentPlayer(playerX);
		game.play(1,1, playerX);
		game.setCurrentPlayer(playerO);
		assertThrows(MarkerAlreadyOccupied.class, ()->game.play(1, 1,playerO));

	}

	@Test
	void whenMarkerBoundWasOutsideOfBoundThenThrowsMarkerOutsideBoardException() {

		assertThrows(MarkerOutsideBoardException.class, ()->game.play(4, 4,playerX));

	}

	@Test
	void whenNextPlayerisSameThePreviousThenThrowsNextPlayerNotDifferentException() {
		game.play(1,1, playerX); // current Player now is playerX 
		assertThrows(NextPlayerNotDifferentException.class, ()->game.play(2, 2,playerX));

	}






}
