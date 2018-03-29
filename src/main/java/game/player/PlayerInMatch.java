package game.player;

import game.match.Match;
import game.move.Move;

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
	public Match match();
	

	/**
	 * <p> An move attempt made by the player.
	 * 
	 * @return
	 */
	public Move move();
}
