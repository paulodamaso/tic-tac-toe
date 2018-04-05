package oldgame.player;

import oldgame.action.ActionInMatch;
import oldgame.match.Match;

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
