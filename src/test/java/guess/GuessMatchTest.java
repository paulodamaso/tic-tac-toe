package guess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import newGame.guess.GuessAction;
import newGame.guess.GuessMatch;
import newGame.guess.GuessPlayer;
import newGame.guess.GuessResult;
import newGame.player.SimplePlayer;

public class GuessMatchTest {

	public GuessMatchTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void resultTest() {
		GuessMatch match = new GuessMatch(new SimplePlayer("The One"));
		
		//the match have not ended yet
		assertEquals(new GuessResult("O jogo ainda não acabou"), match.result());
		
		//the match have already ended, win
		//faking guess match
		SimplePlayer player = new SimplePlayer("The One");
		match = new GuessMatch(7);
		GuessPlayer one = new GuessPlayer(player, match);
		//faking action
		GuessAction action = new GuessAction(match, "7");
		match = action.perform();
		assertEquals(new GuessResult("Caramba acertou :D"), match.result());
		
		player = new SimplePlayer("The One");
		match = new GuessMatch(7);
		one = new GuessPlayer(player, match);
		//faking action
		action = new GuessAction(match, "21");
		match = action.perform();
		//the match have already ended, loss
		assertEquals(new GuessResult("Xi errou :/"), match.result());
		
	}

}
