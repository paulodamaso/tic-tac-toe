package game.player;

import game.move.Mover;

/**
 * <p> Player of a game type.
 *  
 * @author paulodamaso
 *
 */
public interface GamePlayer extends Player {

	public Mover mover();
}
