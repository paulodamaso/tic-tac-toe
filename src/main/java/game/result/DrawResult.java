package game.result;

import game.NoPlayers;
import game.Players;

/**
 * <p> Result created when an match ends in a draw.
 * 
 * @author paulodamaso
 *
 */
public class DrawResult implements Result {

	@Override
	public Players winners() {
		return new NoPlayers();
	}

	@Override
	public Players losers() {
		return new NoPlayers();
	}

}
