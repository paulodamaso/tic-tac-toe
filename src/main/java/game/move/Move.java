package game.move;

import game.match.Match;
import game.player.Player;

/**
 * <p> Class representing the move made by a {@link Player} for a {@link Match}.
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
	public Match perform() ;
	
//	public Match match();

}
