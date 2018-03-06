package tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.SimplePlayer;

/**
 * <p> Tests related to {@link TicTacToeEmptyTile} class.
 * 
 * @author paulodamaso
 *
 */
public class TicTacToeEmptyTileTest {

	public TicTacToeEmptyTileTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void putTest() {
		//putting a value in an EmptyTile must return a new tile with content
		assertEquals(
				new TicTacToeTile(
						new TicTacToeTileContent(
								new SimplePlayer("player")
								)
						), 
				new TicTacToeEmptyTile().put(
						new TicTacToeTileContent(
								new SimplePlayer("player")
								)
						)
				);
	}

}
