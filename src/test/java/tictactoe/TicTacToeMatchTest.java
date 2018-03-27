package tictactoe;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import game.SimplePlayer;
import game.player.Players;
import game.player.SimplePlayers;

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
		
		//testing null comparison
		assertFalse(match.equals(null));
		
		//testing objects with different classes
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
		
		//player1 null, player2 not null for match 1
		match = new TicTacToeMatch(
				null, 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		anotherMatch = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		assertFalse(match.equals(anotherMatch));
		
		//player1 null, for both matches
		match = new TicTacToeMatch(
				null, 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		anotherMatch = new TicTacToeMatch(
				null, 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		assertTrue(match.equals(anotherMatch));
		
		//player1 not null, player2 null for match 1
		match = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				null,  new TicTacToeBoard(3));
		anotherMatch = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		assertFalse(match.equals(anotherMatch));
		
		//player2 null, for both matches
		match = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				null,  new TicTacToeBoard(3));
		anotherMatch = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				null,  new TicTacToeBoard(3));
		assertTrue(match.equals(anotherMatch));
		
		
		//player2 null, for both matches, different player 1 for each match
		match = new TicTacToeMatch(
				null, 
				new SimplePlayer("player2"),  new TicTacToeBoard(3));
		anotherMatch = new TicTacToeMatch(
				null, 
				new SimplePlayer("player4"),  new TicTacToeBoard(3));
		assertFalse(match.equals(anotherMatch));
		
		//hashcode testing, not null objects
		match = new TicTacToeMatch(new SimplePlayer("player1"), new SimplePlayer("player2"), 3);
		anotherMatch = new TicTacToeMatch(new SimplePlayer("player1"), new SimplePlayer("player2"), 3);
		assertTrue(match.hashCode() == anotherMatch.hashCode());

		//hashcode testing, null objects
		match = new TicTacToeMatch(null, null, null);
		anotherMatch = new TicTacToeMatch(null, null, null);
		assertTrue(match.hashCode() == anotherMatch.hashCode());
		
	}
	
	@Test
	public void boadTest() {
		//must return the board passed
		TicTacToeBoard board = new TicTacToeBoard(3);
		TicTacToeMatch match = new TicTacToeMatch(
				new SimplePlayer("player1"), 
				new SimplePlayer("player2"),  board);
		
		assertTrue(board.equals(match.board()));
	}
	
	@Test
	public void playersTest() {
		//must return the array passed
		SimplePlayer player1 = new SimplePlayer("player1");
		SimplePlayer player2 = new SimplePlayer("player2");
		TicTacToeMatch match = new TicTacToeMatch(player1, player2, 3);
		
		Players players = new SimplePlayers(new SimplePlayer[] {player1, player2} );
		
		assertTrue(players.equals(match.players()));
	}
	
	@Test
	public void checkTest() {
		//testing the ending conditions for a match
		TicTacToeMatch  match = new TicTacToeMatch(new SimplePlayer("player1"), new SimplePlayer("player2"), 3);
		assertNull(match.check());
	}

}
