package oddsandevens;

import org.junit.Test;

import mock.MockPlayer;
import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.move.OddsAndEvensValidMove;

/**
 * <p> Test for {@link OddsAndEvensGame} class.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensGameTest {

	public OddsAndEvensGameTest() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p> {@link OddsAndEvensGame#evaluate(oddsandevens.move.OddsAndEvensMove)} tests.
	 * 
	 */
	@Test
	public void evaluateTest() {
		//the rules are simple:
		// - number less than zero returns an invalid move
		// - number more than five returns an invalid move
		// - any other returns an valid move with the number sent
		OddsAndEvensMove um = new OddsAndEvensValidMove(new MockPlayer(), new Integer (7));
		
	}

}
