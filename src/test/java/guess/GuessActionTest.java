package guess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import newGame.guess.GuessActionImpl;
import newGame.guess.GuessMatch;
import newGame.guess.GuessPlayer;
import newGame.guess.InvalidGuessAction;
import newGame.player.SimplePlayer;

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
