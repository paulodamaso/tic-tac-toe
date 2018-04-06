package guess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.player.SimplePlayer;
import oogame.impl.GuessAction;
import oogame.impl.GuessActionImpl;
import oogame.impl.GuessMatch;
import oogame.impl.GuessPlayer;
import oogame.impl.InvalidGuessAction;

/**
 * <p> Tests for {@link GuessAction} class.
 * 
 * @author paulodamaso
 *
 */
public class GuessActionTest {

	public GuessActionTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void evaluateTest() {
		
		SimplePlayer roamer = new SimplePlayer("Roamer");
		GuessMatch match = new GuessMatch(roamer);
		GuessPlayer gp = new GuessPlayer(roamer, match);
		
		//passing an invalid number (text), must return invalid action
		GuessActionImpl action = new GuessActionImpl(match, "Stringy", gp );
		assertEquals(new InvalidGuessAction(action), action.evaluate());
		
		//passing an invalid integer (decimal), must return invalid action
		action = new GuessActionImpl(match, "4.75", gp);
		assertEquals(new InvalidGuessAction(action), action.evaluate());
		
		//passing a valid number
		action = new GuessActionImpl(match, "10", gp);
		assertEquals(action, action.evaluate());
	}
	

	

}
