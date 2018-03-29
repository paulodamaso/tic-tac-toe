package game.result;

import game.player.MatchPlayers;
import game.player.NoPlayers;

/**
 * <p> Interface modeling behaviors of the result of a match. Hold the winners of the match, 
 * the losers and if the result is partial (the match is still being played).
 * 
 * <p> The match must instantiate the results according to its rules; for example, 
 * a chess game does not have a partial result, therefore,  its implementation of the {@link Partial}
 * result interface must return {@link NoPlayers} in its winners and losers methods, meaning that there are no
 * winners or losers yet.
 * 
 * @author paulodamaso
 *
 */
public interface Result {
	
	/**
	 * <p> The winners of the match, if it's already over, or the players who are closer to winning conditions, 
	 * when applicable, if the match is not over yet. 
	 *  
	 * @return {@link MatchPlayers} referencing the group of players who won or are winning, when applicable, the match which this result is associated
	 */
	public MatchPlayers winners();
	
	/**
	 * <p> The losers of the match, if it's already over, or the players who are closer to losing conditions, 
	 * when applicable, if the match is not over yet. 
	 *  
	 * @return {@link MatchPlayers} referencing the group of players who lost or are losing, when applicable, the match which this result is associated
	 */
	public MatchPlayers losers();

	/**
	 * <p>  Defines if this result is a partial result of the match (the match has not ended yet) or definitive (the match has already ended).
	 * 
	 * @return <code>true</code> if the game has not ended yet; <code>false</code> if it has already ended
	 */
	public boolean partial();
}
