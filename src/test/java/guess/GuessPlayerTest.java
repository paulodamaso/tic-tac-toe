package guess;

import org.junit.Test;

import newGame.guess.GuessMatch;
import newGame.guess.GuessPlayer;
import newGame.player.SimplePlayer;

public class GuessPlayerTest {

	public GuessPlayerTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void actTest() {
		
		SimplePlayer player = new SimplePlayer("JQ");
		GuessMatch match = new GuessMatch(player);
		match = new GuessMatch(7);
		GuessPlayer one = new GuessPlayer(player, match);
		//one.act();
	}

}
