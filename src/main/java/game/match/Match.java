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
	 * <p> Add a {@link Move} to a match.
	 * 
	 * @param move
	 * @return
	 */
	public default Match move (Move move) throws Exception{
		return move.perform();
	};
	
	/**
	 * 
	 */
	public Collection<Player> players();
	
	/**
	 * <p> Check winning conditions for the match.
	 * @return
	 */
	public Match check();
	
}
