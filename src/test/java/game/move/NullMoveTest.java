package game.move;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import mock.MockMatch;
import mock.MockPlayer;

/**
 * <p> Tests for the {@link NullMove} class.
 * @author paulodamaso
 *
 */
public class NullMoveTest {

	public NullMoveTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testEquals() {
		//equals method testing
		//condition 1: this and object share the same reference
		NullMove move = new NullMove(new MockMatch(), new MockPlayer());
		assertTrue(move.equals(move));
		
		//condition 2: second object is null
		assertFalse(move.equals(null));
		
		//condition 3: object with different classes
		assertFalse(move.equals(new Integer(10)));
		
		//condition 4: this move match is null (it should never be null since immutable objects does not permits null references, but
		//it'll be tested here anyways 
		move = new NullMove(null, new MockPlayer());
		assertFalse(move.equals(new NullMove(new MockMatch(), null)));
		
		//condition 4.1: this move match is null, other match is not
		move = new NullMove(null, new MockPlayer());
		assertFalse(move.equals(new NullMove(new MockMatch(), new MockPlayer())));

		//condition 4.2: this move match is null, other match is null too
		move = new NullMove(null, new MockPlayer());
		assertTrue(move.equals(new NullMove(null, new MockPlayer())));
		
		//condition 5: this matches not null and different from other match
		assertFalse(new NullMove(new MockMatch(0), new MockPlayer()).equals(new NullMove(new MockMatch(5), new MockPlayer())));
		
		//condition 6: this move player is null
		move = new NullMove(new MockMatch(), null);
		assertFalse(move.equals(new NullMove(new MockMatch(), new MockPlayer())));
		
		//condition 6.1: this move player is null, other is not
		move = new NullMove(new MockMatch(), null);
		assertFalse(move.equals(new NullMove(new MockMatch(), new MockPlayer())));
		
		//condition 6.2: this move player is null, other is null too
		move = new NullMove(new MockMatch(), null);
		assertTrue(move.equals(new NullMove(new MockMatch(), null)));
		
		//condition 7: this player not null and different from other playar
		assertFalse(new NullMove(new MockMatch(), new MockPlayer(0)).equals(new NullMove(new MockMatch(), new MockPlayer(5))));
	} 
	
	@Test
	public void testPlayer() {
		//the player of a null move must be the player passed to it in its constructor
		NullMove move = new NullMove(new MockMatch(), new MockPlayer());
		assertEquals(new MockPlayer(), move.player());
	}
	
	@Test
	public void testPerform() {
		//the perform method of a null move must return its own match, with no changes 
		NullMove move = new NullMove(new MockMatch(), new MockPlayer());
		assertEquals(new MockMatch(), move.perform());
	}
	
	@Test
	//just for 100% coverage
	public void hashCodeTest () {
		NullMove np = new NullMove(null, null);
		//move with both parameters null
		assertEquals(961, np.hashCode());

		//move with player null
		np = new NullMove(new MockMatch(), null);
		assertEquals(1922, np.hashCode());
		
		//move with match null
		np = new NullMove(null, new MockPlayer());
		assertEquals(992, np.hashCode());
		
		//move with the two parameter populated
		np = new NullMove(new MockMatch(), new MockPlayer());
		assertEquals(1953, np.hashCode());		
		
	}

}
