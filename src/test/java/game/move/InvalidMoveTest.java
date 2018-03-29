package game.move;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import mock.MockInvalidMove;
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
}
