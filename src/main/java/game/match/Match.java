package game.match;

import game.Game;
import game.Players;
import game.move.Move;
import game.result.Result;

/**
 * <p> An interface representing a match of a particular {@link Game}.
 * 
 * @author paulodamaso
 *
 */
public interface Match {

	/**
	 * <p> Add a {@link Move} to a match, creating an ending condition ({@link FinishedMatch})  if
	 * this move brings the match to an end.
	 *  
	 * @param move
	 * @return the current match as an immutable object
	 */
	public default Match move (Move move) throws Exception{
		return move.perform().check();
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
		
		while(!move(players().next().move()).check().finished()) {
			//keep running while the match is unfinished
		}
	}
	
	/**
	 * <p> Returns the {@link Result} of the match; if the match is not
	 * finished yet, must return an {@link UnfinishedMatchResult} with the current
	 * match situation. 
	 * 
	 * @return
	 */
	public Result result();
	
	/**
	 * <p> Returns if the {@link Match} is finished or not. A match is finished if it matches
	 * any of the winning conditions defined in the {@link #check()} method.  
	 */
	public default boolean finished() {
		return false;
	}
 
}
