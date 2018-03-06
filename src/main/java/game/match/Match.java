package game.match;

import game.Game;
import game.move.Move;

/**
 * <p> An interface representing a match of a particular {@link Game}.
 * 
 * <p> The expected behavior of a game regarding new moves:
 * <ul>
 * <li> game must evaluate a move assuring it is valid according to game rules
 * </ul>
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

	/**
	 * <p> Add a {@link Move} to a match.
	 * 
	 * @param move
	 * @return
	 */
	public Match move (Move move) ;
	
}
