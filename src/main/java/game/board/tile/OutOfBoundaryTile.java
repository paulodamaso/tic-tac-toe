package game.board.tile;

import game.board.Board;
import game.position.BiDimensionalNullPosition;

/**
 * <p> A tile that is out of the {@link Board} boundaries.
 * 
 * @author paulodamaso
 *
 */
public interface OutOfBoundaryTile extends BiDimensionalTile {

	public default BiDimensionalNullPosition position() {
		return null;
	};
}
