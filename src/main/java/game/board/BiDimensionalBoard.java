package game.board;

import game.board.tile.BiDimensionalTileImp;
import game.board.tile.OutOfBoundaryBiDimen;
import game.move.Move;
import game.position.BiDimensionalPosition;

/**
 * <p> A board with two dimensions.
 * 
 * @author paulodamaso
 *
 */
public final class BiDimensionalBoard implements Board<BiDimensionalTileImp, BiDimensionalPosition, Move> {
	
	private final BiDimensionalTileImp[][] tiles;
	private final int width;
	private final int height;

	public BiDimensionalBoard(int width, int height) {
		//create a bi-dimensional board with the provided size
		this.tiles = new BiDimensionalTileImp[width][height];
		this.width = width;
		this.height = height;
	}

	@Override
	public Move perform(Move move) {
//		tiles[move.]
		return null;
	}

	@Override
	public BiDimensionalTileImp inBoundary(BiDimensionalTileImp tile) {
		return (tile.position().x() > 0 && tile.position().x() < width) &&
		(tile.position().y() > 0 && tile.position().y() < height) ? tile: new OutOfBoundaryBiDimen(tile);
	}

	@Override
	public boolean empty(BiDimensionalTileImp tile) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
