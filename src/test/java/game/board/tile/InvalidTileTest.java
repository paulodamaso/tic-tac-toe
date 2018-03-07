package game.board.tile;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import game.SimplePlayer;
import game.board.tile.InvalidTile;
import tictactoe.TicTacToeEmptyTile;
import tictactoe.TicTacToeTile;
import tictactoe.TicTacToeTileContent;

public class InvalidTileTest {

	public InvalidTileTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void contentTest() {
		//add content to a invalid tile, throws an exception
		Throwable excep =  null;
		InvalidTile tile = new InvalidTile(new TicTacToeEmptyTile());
		try {
			tile.content();
		} catch (Exception e) {
			excep = e;
		}
		assertNotNull(excep);
	}
	
	@Test
	public void putTest() {
		//add content to a invalid tile, throws an exception
		Throwable excep =  null;
		InvalidTile tile = new InvalidTile(new TicTacToeEmptyTile());
		try {
			tile.put(new TicTacToeTileContent(new SimplePlayer("player1") ));
		} catch (Exception e) {
			excep = e;
		}
		assertNotNull(excep);
	}
	
	@Test
	public void hashCodeTest() {
		//hashcode test, equal objects, must be equal
		InvalidTile tile = new InvalidTile(new TicTacToeEmptyTile());
		InvalidTile anotherTile = new InvalidTile(new TicTacToeEmptyTile());
		assertTrue(tile.hashCode() == tile.hashCode());

		//hashcode test, non-equal objects, must be equal: all invalid tiles are equals (?)
		tile = new InvalidTile(new TicTacToeEmptyTile());
		anotherTile = new InvalidTile(new TicTacToeTile(new TicTacToeTileContent(new SimplePlayer("player1"))));
		assertTrue(tile.hashCode() == anotherTile.hashCode());		
	}

}
