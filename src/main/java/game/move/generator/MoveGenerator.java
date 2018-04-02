package game.move.generator;

import game.move.Move;
import game.player.PlayerInMatch;

/**
 * <p> Move generator 
 * 
 * @author paulodamaso
 *
 */
public interface MoveGenerator<P extends PlayerInMatch> {

	public Move create(P player);
}
