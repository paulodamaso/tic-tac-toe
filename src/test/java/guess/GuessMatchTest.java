package guess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.player.SimplePlayer;
import oogame.impl.SimpleGuessAction;
import oogame.impl.GuessMatch;
import oogame.impl.GuessPlayer;
import oogame.impl.GuessResult;

/**
 * <p> {@link GuessMatch} tests.
 * 
 * @author paulodamaso
 *
 */
public class GuessMatchTest {

	public GuessMatchTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void resultTest() {
		GuessMatch match = new GuessMatch(new SimplePlayer("The One"));
		
		//the match have not ended yet
		assertEquals(new GuessResult("The match has not ended yet", match), match.result());
		
		//the match have already ended, win
		//faking guess match
		SimplePlayer player = new SimplePlayer("The One");
		match = new GuessMatch(new Integer(7));
		GuessPlayer one = new GuessPlayer(player, match);
		//faking action
		SimpleGuessAction action = new SimpleGuessAction(match, "7", one);
		match = action.perform();
		assertEquals(new GuessResult("Wow, you've guessed the number! :D", match), match.result());
		
		player = new SimplePlayer("The One");
		match = new GuessMatch(new Integer(7));
		one = new GuessPlayer(player, match);
		//faking action
		action = new SimpleGuessAction(match, "21", one);
		match = action.perform();
		//the match have already ended, loss
		assertEquals(new GuessResult("Oh no, you're wrong :/", match), match.result());
		
	}

}
