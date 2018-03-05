package game.board.tile;

import game.position.BiDimensionalPosition;

/**
 * <p> Decorator representing an occupied tile.
 * 
 * @author paulodamaso
 *
 */
public final class EmptyBiDimensionalTile implements EmptyTile<BiDimensionalPosition> {

	private final Tile<BiDimensionalPosition> origin;
	
	public EmptyBiDimensionalTile(Tile<BiDimensionalPosition> origin) {
		this.origin = origin;
	}

	@Override
	public BiDimensionalPosition position() {
		return origin.position();
	}

}
