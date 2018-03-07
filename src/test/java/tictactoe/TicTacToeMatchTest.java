package tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import game.SimplePlayer;

/**
 * <p> Tests related to {@link TicTacToeMatch}.
 * 
 * @author paulodamaso
 *
 */
public class TicTacToeMatchTest {

	public TicTacToeMatchTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void initTest() {
		
		assertEquals(
				new TicTacToeMatch(
						new SimplePlayer("player1"), 
						new SimplePlayer("player2"), 
						3), 
				new TicTacToeMatch(
						new SimplePlayer("player1"), 
						new SimplePlayer("player2"),  new TicTacToeBoard(3)));
	}
	
	@Test
	public void equalsTest() {
		//testing the same reference
		TicTacToeMatch match = new TicTacToeMatch(new SimplePlayer("player1"), new SimplePlayer("player2"), 3);
		assertTrue(match.equals(match));
		
		//testing null obj
		assertFalse(match.equals(null));
		
		//testing objtects with different classes
		assertFalse(match.equals(new SimplePlayer("dummy")));
		
		//testing null board, other board not null
		match = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  null);
		TicTacToeMatch anotherMatch = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  new TicTacToeBoard(5));
		assertFalse(match.equals(anotherMatch));
		
		//testing both boards null
		match = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  null);
		anotherMatch = new TicTacToeMatch(
				new SimplePlayer("player3"), 
				new SimplePlayer("player4"),  null);
		assertFalse(match.equals(anotherMatch));	
		
		//testing different boards
		match = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  new TicTacToeBoard(5));
		anotherMatch = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		assertFalse(match.equals(anotherMatch));
	}

}
