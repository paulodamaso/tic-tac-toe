package tictactoe;

import oldgame.board.tile.Tile;
import oldgame.board.tile.TileContent;

/**
 * <p> {@link Tile} implementation for a tic tac toe game.
 * 
 * <p> Models an occupied tile; the tile is created with some value.
 * 
 * @author paulo
 *
 */
public final class TicTacToeTileImp implements TicTacToeTile {
	
	private final TicTacToeTileContentImpl content;
	
	public TicTacToeTileImp(TicTacToeTileContentImpl content) {
		this.content = content;
	}

	@Override
	public TicTacToeTile put(TicTacToeTileContentImpl content) throws Exception {
		//cannot overwrite content in tile; must return invalid tile exception
		/**
		 * @todo #3 return an exception indicating that the content of the tile cannot
		 *  be overwritten 
		 */
		throw new Exception();

	}

	@Override
	public TicTacToeTileContentImpl content() {
		return this.content;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			TileContent tileContent = ((Tile)obj).content();
			return content.equals(tileContent);
		} catch (Exception e) {
			return false;
		}
	}

}
