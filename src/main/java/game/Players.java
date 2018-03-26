package game;

import game.match.Match;

/**
 * <p> Interface for modeling the players playing a {@link Match}.
 * 
 * @author paulodamaso
 *
 */
public interface Players {

	/**
	 * <p> Return the next {@link Player} to play. Iterates the player list
	 * returning to the start when the end is reached.
	 * 
	 * @return next player
	 */
	public Player next();
	
}
