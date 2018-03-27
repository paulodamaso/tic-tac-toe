package game.player;

import game.move.Move;

/**
 * <p> Class representing a player.
 * 
 * @author paulodamaso
 *
 */
public interface Player {

	/**
	 * <p> The player name.
	 * 
	 * @return
	 */
	public String name();
	
	/**
	 * <p> An move attempt made by the player.
	 * 
	 * @return
	 */
	public Move move();
}
