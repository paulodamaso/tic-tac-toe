package tictactoe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import game.Player;
import game.SimplePlayer;
import game.board.Board;
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

		//add content to a invalid position, must return exception
		Throwable excep =  null;
		try {
			board.add( new BiDimensionalPosition(-1, -1), new TicTacToeTileContentImpl(new SimplePlayer("player1") ));
		} catch (Exception e) {
			excep = e;
		}
		assertNotNull(excep);
		
		
		//add content to a valid non-empty position, return exception?
		board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContentImpl(new SimplePlayer("player1")));
		assertThrows(Exception.class, 
				() -> board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContentImpl(new SimplePlayer("player"))));
		
	}
	
	@Test
	public void equalsTest() {
		//same reference
		TicTacToeBoard board = new TicTacToeBoard(3);
		assertTrue(board.equals(board));
		
		//null object reference
		assertFalse(board.equals(null));
		
		//different classes
		assertFalse(board.equals(new SimplePlayer("dummy")));
		
		//comparing tiles
		//obj1 with null tiles, obj2 with valid board
		TicTacToeBoard otherBoard = new TicTacToeBoard(3);
		board = new TicTacToeBoard(null);
		assertFalse(board.equals(otherBoard));
		
		//both objects with null boards
		otherBoard = new TicTacToeBoard(null);
		board = new TicTacToeBoard(null);
		assertTrue(board.equals(otherBoard));
		
		//both valid objects, but different
		otherBoard = new TicTacToeBoard(3);
		board = new TicTacToeBoard(5);
		assertFalse(board.equals(otherBoard));
		
		//both equals valid objects
		otherBoard = new TicTacToeBoard(3);
		board = new TicTacToeBoard(3);
		assertTrue(board.equals(otherBoard));
		
		//hashcode test, equal objects
		board = new TicTacToeBoard(3);
		otherBoard = new TicTacToeBoard(3);
		assertTrue(board.hashCode() == otherBoard.hashCode());

		//hashcode test, non-equal objects
		board = new TicTacToeBoard(null);
		otherBoard = new TicTacToeBoard(5);
		assertFalse(board.hashCode() == otherBoard.hashCode());
		
	}
	
	@Test
	public void checkTest () throws Exception {
		//test for checking ending game conditions, according to the board state
		//ending condition for a tic tac toe game:
		// any line
		// any column
		//left to right diagonal
		//right to left diagonal
		Player player1 = new SimplePlayer("X");
		Player player2 = new SimplePlayer("O");
		
		
		// x |   |   
		// x |   |
		// x |   |
		//x wins, checks who's winner
		Board board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(0, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(0, 2), new TicTacToeTileContentImpl(player1));
		//the winner must be player 1
		assertEquals(player1, board.check().winners().next());
		
		//   | X |   
		//   | X |
		//   | X |
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(1, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 2), new TicTacToeTileContentImpl(player1));
		board.check();
		
		//   |   | X   
		//   |   | X
		//   |   | X
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(2, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 2), new TicTacToeTileContentImpl(player1));
		board.check();
		
		// x | x | x   
		//   |   |
		//   |   |
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 0), new TicTacToeTileContentImpl(player1));
		board.check();
		//		assertEquals(player1, board.check().check());
		
		//   |   |   
		// X | X | X
		//   |   |
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 1), new TicTacToeTileContentImpl(player1));
		board.check();
		
		//   |   |    
		//   |   | 
		// X | X | X 
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 2), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 2), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 2), new TicTacToeTileContentImpl(player1));
		board.check();
		
		// X |   |    
		//   | X | 
		//   |   | X 
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 2), new TicTacToeTileContentImpl(player1));
		board.check();
		
		//   |   | X    
		//   | X | 
		// X |   |   
		//x wins, checks who's winner
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 2), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 0), new TicTacToeTileContentImpl(player1));
		board.check();

		// X | O | O    
		// O | X | X
		// X | X | O  
		//draw
		//checks draw (full board, no winner)
		board = new TicTacToeBoard(3);
		board.add(new BiDimensionalPosition(0, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(0, 1), new TicTacToeTileContentImpl(player2));
		board.add(new BiDimensionalPosition(0, 2), new TicTacToeTileContentImpl(player2));
		board.add(new BiDimensionalPosition(1, 0), new TicTacToeTileContentImpl(player2));
		board.add(new BiDimensionalPosition(1, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(1, 2), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 0), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 1), new TicTacToeTileContentImpl(player1));
		board.add(new BiDimensionalPosition(2, 2), new TicTacToeTileContentImpl(player2));
		board.check();
		

		
		
		//
		
//		try {
//				
//				TicTacToeBoard board = null;
//				
//				//any line
//				int dimension = new Double(Math.sqrt(new Integer(board.tiles().size()).doubleValue())).intValue();
//				
//				for(int i = 0; i< dimension; i++) {
//					boolean line = true;
//					//check if all lines are
//					int j = 0;
//					while(line && j < dimension) {
//						line = line && board.tile(new BiDimensionalPosition(0, 0)).content().equals(board.tile(new BiDimensionalPosition(i, j)).content());
//					}
//				}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
	}

}
