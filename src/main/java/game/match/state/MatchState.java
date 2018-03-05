package game.match.state;

import game.match.Match;

/**
 * <p> Interface representing the state of a {@link Match}.
 *  
 * @author paulodamaso
 *
 */
public interface MatchState {

	public Match start (Match match);
	public Match play (Match match);
	public Match end (Match match);
	public Match draw (Match match);
	
}
