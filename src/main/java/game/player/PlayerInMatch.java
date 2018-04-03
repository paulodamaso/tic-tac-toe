package game.player;

import game.action.ActionInMatch;
import game.match.Match;

/**
 * <p> A player assigned to a {@link Match}
 * 
 * @author paulodamaso
 *
 */
public interface PlayerInMatch extends GamePlayer {
	
	/**
	 * <p> The match this player is assigned or playing. 
	 */
	public abstract Match match();
	
	/**
	 * <p> An action made by the player.
	 * 
	 * 
	 * @return
	 */
	public abstract ActionInMatch act();
}
