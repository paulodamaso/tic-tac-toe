package guess;

import org.junit.Test;

import game.player.SimplePlayer;
import oogame.impl.GuessMatch;
import oogame.impl.GuessPlayer;

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
