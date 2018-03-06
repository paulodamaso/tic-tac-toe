package tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

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

}
