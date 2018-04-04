package guess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import newGame.action.InvalidAction;
import newGame.guess.GuessAction;
import newGame.guess.GuessMatch;
import newGame.player.SimplePlayer;

public class GuessActionTest {

	public GuessActionTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void evaluateTest() {
		
		//passing an invalid number (text), must return invalid action
		GuessAction action = new GuessAction(new GuessMatch(new SimplePlayer("Roamer")), "Stringy");
		assertEquals(new InvalidAction(action), action.evaluate());
		
		//passing an invalid integer (decimal), must return invalid action
		action = new GuessAction(new GuessMatch(new SimplePlayer("Roamer")), "4.75");
		assertEquals(new InvalidAction(action), action.evaluate());
		
		//passing a valid number
		action = new GuessAction(new GuessMatch(new SimplePlayer("Roamer")), "10");
		assertEquals(action, action.evaluate());
	}
	

	

}
