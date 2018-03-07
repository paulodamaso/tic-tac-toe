package tictactoe;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import game.SimplePlayer;

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
	public void putTest () throws Exception {
		//putting a value in an tile with content (TicTacToeTiles are always occupied)
		//should:
		//- exception if the tile is occupied 
		//or
		//- invalid tile if this tile is occupied
		
		//create a tile already populated
		TicTacToeTile tile = new TicTacToeTile(new TicTacToeTileContent(new SimplePlayer("player1")));
		
		//try to put something in it, throws exception
		assertThrows(Exception.class, 
				() -> tile.put(new TicTacToeTileContent(new SimplePlayer("player2"))
						)
				);
	}
	
	@Test
	public void equalsTest() {
		assertTrue(
				new TicTacToeTile(
						new TicTacToeTileContent(
								new SimplePlayer("Paulo")
								)
						).equals(
								new TicTacToeTile(
										new TicTacToeTileContent(
												new SimplePlayer("Paulo")
												)
										)
								)
				);
		assertFalse(
				new TicTacToeTile(
						new TicTacToeTileContent(
								new SimplePlayer("Paulo")
								)
						).equals(
								new Integer(10)
								)
				);
	}
}
