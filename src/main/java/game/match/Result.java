package game.match;

import java.util.Collection;

import game.Player;

/**
 * <p> Class representing the result of a match.
 * 
 * @author paulodamaso
 *
 */
public interface Result {

	/**
	 * <p> Winners of the match.
	 * @return
	 */
	public Collection<Player> winners();
	
	/**
	 * <p> Losers of the match.
	 * @return
	 */
	public Collection<Player> losers();
}
