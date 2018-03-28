package game.player;

import game.match.Match;

/**
 * <p> Interface for modeling the players playing a {@link Match}.
 * 
 * @author paulodamaso
 *
 */
public interface MatchPlayers {
	
	/**
	 * <p> The match which this players are playing
	 */
	public Match match();

	/**
	 * <p> Return the next player to play.
	 * 
	 * @return
	 */
	public PlayerInMatch next();
	
	/**
	 * <p> Return the last player who played.
	 * 
	 * @return
	 */
	public PlayerInMatch previous();
	
}
