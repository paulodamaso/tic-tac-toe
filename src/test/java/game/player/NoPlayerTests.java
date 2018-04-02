package game.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.match.Match;
import mock.MockMatch;

/**
 * <p> Tests for {@link NoPlayers} class.
 * 
 * @author paulodamaso
 *
 */
public class NoPlayerTests {

	@Test
	public void nextTest() {
		Match mock = new MockMatch();
		NoPlayers np = new NoPlayers(mock);
		
		assertEquals(new NullPlayer(mock), np.next());
	}
	
	@Test
	public void previousTest() {
		Match mock = new MockMatch();
		NoPlayers np = new NoPlayers(mock);
		
		assertEquals(new NullPlayer(mock), np.previous());
	}
}
