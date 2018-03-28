package game.match;

import game.Game;
import game.player.MatchPlayers;
import game.result.Result;

/**
 * <p> An interface representing a match of a particular {@link Game}.
 * 
 * @author paulodamaso
 *
 */
public interface Match {
	
	/**
	 * <p> Returns the {@link Result} of the match (checks winning conditions and game ending conditions).
	 * 
	 * @return
	 */
	public Result result();
	
	public MatchPlayers players();
	
}
