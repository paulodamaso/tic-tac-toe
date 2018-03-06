package tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.SimplePlayer;
import game.board.tile.InvalidTile;

/**
 * <p> Tests related to {@link TicTacToeTile} class.
 * 
 * @author paulodamaso
 *
 */
public class TicTacToeTileTest {

	public TicTacToeTileTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void putTest () {
		//putting a value in an tile with content (TicTacToeTiles are always occupied)
		//should:
		//- exception if the tile is occupied 
		//or
		//- invalid tile if this tile is occupied
		
		//create a tile already populated
		TicTacToeTile tile = new TicTacToeTile(new TicTacToeTileContent(new SimplePlayer("player1")));
		
		//try to put something in it
		assertEquals(new InvalidTile(tile), tile.put(new TicTacToeTileContent(new SimplePlayer("player2"))));
	}
}
