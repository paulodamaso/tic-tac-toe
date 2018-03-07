package game;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 * <p> Tests for {@link SimplePlayer} class.
 * 
 * @author paulodamaso
 *
 */
public class SimplePlayerTest {

	public SimplePlayerTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void equalsTest() {
		SimplePlayer player1 = new SimplePlayer("player1");
		
		//testing the same reference
		assertTrue(player1.equals(player1));
		
		//testing null comparison
		assertFalse(player1.equals(null));
		
		//testing objects with different classes
		assertFalse(player1.equals(new Integer(10)));

		SimplePlayer player2 = new SimplePlayer("player1");

		assertTrue(player1.equals(player2) && player2.equals(player1));
		assertTrue(player1.hashCode() == player2.hashCode());
		
		//testing a different player
		player2 = new SimplePlayer("player2");
		assertFalse(player1.equals(player2) && player2.equals(player1));
		assertFalse(player1.hashCode() == player2.hashCode());
	}

}
