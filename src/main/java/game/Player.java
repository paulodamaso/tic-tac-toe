package game;

import game.move.Move;

/**
 * <p> Class representing a player.
 * 
 * @author paulodamaso
 *
 */
public interface Player {

	public String name();
	
	public Move move();
}
