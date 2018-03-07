package game.board.tile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.SimplePlayer;
import game.board.tile.EmptyTile;
import tictactoe.TicTacToeEmptyTile;
import tictactoe.TicTacToeTile;
import tictactoe.TicTacToeTileContent;

/**
 * <p> Tests related to {@link EmptyTile} class.
 * 
 * @author paulodamaso
 *
 */
public class EmptyTileTest {

	public EmptyTileTest() {
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
