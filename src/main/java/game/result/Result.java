package game.result;

import game.Players;

/**
 * <p> Class representing the result of a match.
 * 
 * @author paulodamaso
 *
 */
public interface Result {
	
	public Players winners();
	public Players losers();

}
