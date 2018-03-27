package game.match;

import game.Game;
import game.move.Move;
import game.player.Players;
import game.result.Result;

/**
 * <p> An interface representing a match of a particular {@link Game}.
 * 
 * @author paulodamaso
 *
 */
public interface Match {

	/**
	 * <p> Add a {@link Move} to a match. The move executes itself (performs) returning a new instance of
	 * the match, with the changes caused by the move applied.
	 *  
	 * @param move
	 * @return the current match as an immutable object
	 */
	public default Match addMove (Move move) throws Exception{
		return move.perform();
	};
	
	/**
	 * <p> The players playing this match.
	 */
	public Players players();
	
	/**
	 * <p> Check ending conditions for the match, returning the current match as a immutable object.
	 * 
	 * @return
	 */
	public Match check();
	
	/**
	 * <p> The default implementation of a match being played. Must be overwritten
	 * for more complex matches. 
	 */
	public default void play() throws Exception{
		
		while(addMove(players().next().move()).check().result().partial()) {
			//keep running while the match is unfinished
			//e.g., the result is partial
		}
	}
	
	/**
	 * <p> Returns the {@link Result} of the match.
	 * 
	 * @return
	 */
	public Result result();
	
}
