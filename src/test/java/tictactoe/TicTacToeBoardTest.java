package tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import game.SimplePlayer;
import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.position.BiDimensionalPosition;

/**
 * <p> Tests related to {@link TicTacToeBoard}.
 * 
 * @author paulodamaso
 *
 */
public class TicTacToeBoardTest {

	public TicTacToeBoardTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test 
	public void init() {
		//test board initialization with empty spaces
		TicTacToeBoard board = new TicTacToeBoard(3);
		
		for(Tile tile : board.tiles()) {
			assertEquals(new TicTacToeEmptyTile(), tile);
		}
	}
	
	@Test
	public void tileTest() {
		TicTacToeBoard board = new TicTacToeBoard(3);
		
		//getting a valid tile: inside boundaries at 1,1
		assertEquals(new TicTacToeEmptyTile(), board.tile(new BiDimensionalPosition(1,1)));
		
		//getting an invalid tile: outwside boundaries at 5,5
		assertEquals(new InvalidTile(new TicTacToeEmptyTile()), board.tile(new BiDimensionalPosition(5,5)));
		
	}
	
	@Test
	public void addTest() throws Exception{
		//add content to a position
		
		TicTacToeBoard board = new TicTacToeBoard(3);
		
		//add content to a invalid position, return exception
		assertThrows(Exception.class, 
				() -> board.add(new BiDimensionalPosition(-1, -1), new TicTacToeTileContent(new SimplePlayer("player1"))));
		
		//add content to a valid non-empty position, return exception?
		board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContent(new SimplePlayer("player1")));
		assertThrows(Exception.class, 
				() -> board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContent(new SimplePlayer("player"))));
		
	}

}
