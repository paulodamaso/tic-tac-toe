package game.board.tile;

import game.position.Position;

/**
 * <p> This interface represents a board tile.
 * 
 * @author paulodamaso
 *
 */
public interface Tile<P extends Position> {

	public P position();

}
