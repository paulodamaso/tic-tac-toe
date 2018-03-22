package game.match;

import java.util.Collection;

import game.Game;
import game.Player;
import game.move.Move;

/**
 * <p> An interface representing a match of a particular {@link Game}.
 * 
 * @author paulodamaso
 *
 */
public interface Match {

	/**
	 * <p> Add a {@link Move} to a match and checks if it has reached a ending condition.
	 * 
	 * @param move
	 * @return
	 */
	public default Match move (Move move) throws Exception{
		return move.perform().check();
	};
	
	/**
	 * 
	 */
	public Collection<Player> players();
	
	/**
	 * <p> Check ending conditions for the match, returning the current match as a immutable object.
	 * 
	 * @return
	 */
	public Match check();
	
}
