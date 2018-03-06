package game.match;

import game.Game;
import game.move.Move;

/**
 * <p> An interface representing a match of a particular {@link Game}.
 * 
 * @author paulodamaso
 *
 */
public interface Match {
	
	/**
	 * <p> Game being played. 
	 * @return
	 */
	public Game game();
	
	public default Match addMove (Move move) {
		//evaluate move according to game rules
		//perform move
		return move(game().evaluate(move));
	}
	
	/**
	 * <p> Logic of each move.
	 * @param move
	 * @return
	 */
	public Match move (Move move) ;

}
