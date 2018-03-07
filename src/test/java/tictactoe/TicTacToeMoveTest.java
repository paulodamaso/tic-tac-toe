package tictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import game.SimplePlayer;
import game.position.BiDimensionalPosition;

/**
 * <p> Tests for {@link TicTacToeMove}.
 * 
 * @author paulodamaso
 *
 */
public class TicTacToeMoveTest {

	public TicTacToeMoveTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void initTest() {
		SimplePlayer player1 = new SimplePlayer("player1");
		SimplePlayer player2 = new SimplePlayer("player2");
		TicTacToeMatch match = new TicTacToeMatch(player1, player2, 3);
		BiDimensionalPosition position = new BiDimensionalPosition(0, 0);
		TicTacToeMove move = new TicTacToeMove(player1, position, match);
		assertEquals(player1, move.player());
		assertEquals(position, move.position());

	}
	
	@Test
	public void performTest() {
		
		SimplePlayer player1 = new SimplePlayer("player1");
		SimplePlayer player2 = new SimplePlayer("player2");
		TicTacToeMatch match = new TicTacToeMatch(player1, player2, 3);
		BiDimensionalPosition position = new BiDimensionalPosition(-1, -1);
		TicTacToeMove move = new TicTacToeMove(player1, position, match);

		//invalid tile, must throw exception
		Throwable excep = null;
		try {
			move.perform();
		} catch (Exception e) {
			excep = e;
		}
		assertNotNull(excep);
		
		//valid non-empty tile, must throw exception
		
		//valid empty tile
		
		
	}

}
