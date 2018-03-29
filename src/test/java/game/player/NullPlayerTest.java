package game.player;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

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
	
	@Test
	public void nameTest() {
		//null playermust return the stored match 
		Match mock = new MockMatch();
		NullPlayer np = new NullPlayer(mock);
		
		assertNull(np.name());		
	}
	
	@Test
	public void matchTest() {
		//null player must return the stored match
		Match mock = new MockMatch();
		NullPlayer np = new NullPlayer(mock);
		assertEquals(new MockMatch(), np.match());
	}
	
	@Test
	public void equalsTest () {
		//test same reference
		NullPlayer np = new NullPlayer(new MockMatch());
		assertTrue(np.equals(np));
		
		//second object is null
		assertFalse(np.equals(null));
		
		//objects with different classes
		assertFalse(np.equals(new Integer(10)));
		
		//this match match is null and its being tested against a player with a non-null match
		np = new NullPlayer(null);
		assertFalse(np.equals(new NullPlayer(new MockMatch())));

		//this player match is null, other match is null too
		np = new NullPlayer(null);
		assertTrue(np.equals(new NullPlayer(null)));
		
		//players have different matches
		np = new NullPlayer(new MockMatch(10));
		assertFalse(np.equals(new NullPlayer(new MockMatch(20))));
	}
	
	@Test
	//just for 100% coverage
	public void hashCodeTest () {
		NullPlayer np = new NullPlayer(null);
		//null match player hashcode
		assertEquals(31, np.hashCode());
		
		np = new NullPlayer(new MockMatch());
		//not null match player hashcode
		assertEquals(62, np.hashCode());
		
	}

}
