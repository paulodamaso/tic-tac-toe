package game.board.tile;

import game.position.Position;

/**
 * <p> An empty {@link Tile}
 * @author paulodamaso
 *
 */
public interface EmptyTile<P extends Position> extends Tile<P> {

	public default boolean empty () {
		return true;
	} 
}
