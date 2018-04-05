package newGame.match;

import newGame.player.Player;
import newGame.player.Players;
import newGame.result.Result;

public interface Match {
	
	//public Players<P> players();

	public Result result();
	
	public Result play();
}
