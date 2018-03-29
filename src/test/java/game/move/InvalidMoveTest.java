package game.move;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import mock.MockInvalidMove;
import mock.MockMatch;
import mock.MockMove;
import mock.MockPlayer;

/**
 * <p> Test for {@link InvalidMove} code.
 * 
 * @author paulodamaso
 *
 */
public class InvalidMoveTest {

	/**
	 * <p> Test {@link InvalidMove#player()} method.
	 */
	@Test
	public void testPlayer() {
		InvalidMove invalid = new MockInvalidMove(new MockMove(new MockPlayer()));
		assertEquals(new MockPlayer(), invalid.player());
	}
	
	@Test
	public void matchTest() {
		InvalidMove nm = new MockInvalidMove(new MockMove(new MockPlayer(700)));
		assertEquals(new MockMatch(700), nm.match());
		
	}
	
	@Test
	public void testPerform() {
		//the perform method of a invalid move must return its own match, with no changes 
		InvalidMove move = new MockInvalidMove(new MockMove(new MockPlayer(100)));
		assertEquals(new MockMatch(100), move.perform());
	}
}
