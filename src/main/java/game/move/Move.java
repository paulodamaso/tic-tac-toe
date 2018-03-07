package game.move;

import game.Player;
import game.match.Match;

/**
 * <p> Class representing the move made by a {@link Player}.
 * 
 * @author paulodamaso
 *
 */
public interface Move {

	/**
	 * <p> The player that made the move.
	 * @return
	 */
	public Player player();
	
	/**
	 * <p> Perform the move an return the new {@link Match} with the move performed.
	 *  
	 * @return {@link Match} representing the match state after the move.
	 */
	public Match perform() throws Exception;

}
