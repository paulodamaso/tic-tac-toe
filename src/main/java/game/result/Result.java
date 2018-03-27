package game.result;

import game.Players;

/**
 * <p> Class representing the result of a match. Hold the winners of the match, 
 * the losers and if the result is partial (the match is still being played).
 * 
 * @author paulodamaso
 *
 */
public interface Result {
	
	public Players winners();
	public Players losers();
	
	public boolean partial();

}
