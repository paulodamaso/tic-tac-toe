package game.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.match.Match;
import game.move.NullMove;
import mock.MockMatch;

/**
 * <p> Tests for {@link NullPlayer} class.
 * 
 * @author paulodamaso
 *
 */
public class NullPlayerTest {

	public NullPlayerTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void moveTest() {
		//null player move must return the same match sent to its constructor
		Match mock = new MockMatch();
		NullPlayer np = new NullPlayer(mock);
		
		assertEquals(new NullMove(mock, np), np.move());
	}

}
