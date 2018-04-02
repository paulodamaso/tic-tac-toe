package game.player;

import game.match.Match;
import game.move.Move;
import game.move.UnevaluatedMove;

/**
 * <p> A player assigned to a {@link Match}
 * 
 * @author paulodamaso
 *
 */
public interface PlayerInMatch extends Player {
	
	/**
	 * <p> The match this player is assigned or playing. 
	 */
	public Match match();
	

	/**
	 * <p> An move attempt made by the player.
	 * 
	 * @return
	 */
	public UnevaluatedMove move();
}
