package game.player;

import game.match.Match;

/**
 * <p> Interface for modeling the players playing a {@link Match}.
 * 
 * @author paulodamaso
 *
 */
public interface Players {

	/**
	 * <p> Return the next player to play.
	 * 
	 * @return
	 */
	public Player next();
	
	/**
	 * <p> Return the last player who played.
	 * 
	 * @return
	 */
	public Player previous();
	
}
