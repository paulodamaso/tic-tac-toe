package game.match;

import game.player.MatchPlayers;
import game.result.Result;

/**
 * <p> An interface representing a match of a particular game.
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
	public abstract Result result();
	
	/**
	 * <p> Starts the match and keep running while its result is partial.
	 * 
	 */
	public default void start() {
		Result res = null;
		do {
			res = null;
		}while (players().next().act().evaluate().perform().result().partial());
	}
	
	/**
	 * <p> Collection of players playing the match.
	 * 
	 * @return
	 */
	public abstract MatchPlayers players();
	
}
