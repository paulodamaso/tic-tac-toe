package game.board.tile;

import game.position.BiDimensionalPosition;

/**
 * <p> Bi-Dimensional Tile implementation
 * 
 * @author paulodamaso
 *
 */
public final class BiDimensionalTileImp implements BiDimensionalTile {

	private final BiDimensionalPosition position;
	
	public BiDimensionalTileImp(int y, int x) {
		this.position = new BiDimensionalPosition(x, y);
	}
	
	public BiDimensionalTileImp(BiDimensionalPosition position) {
		this.position = position;
	}

	@Override
	public BiDimensionalPosition position() {
		return position;
	}
}
