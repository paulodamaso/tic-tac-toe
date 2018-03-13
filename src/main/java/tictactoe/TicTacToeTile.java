package tictactoe;

import game.board.tile.Tile;
import game.board.tile.TileContent;

/**
 * <p> {@link Tile} implementation for a tic tac toe game.
 * 
 * @author paulo
 *
 */
public final class TicTacToeTile implements Tile {
	
	private final TileContent content;
	
	public TicTacToeTile(TileContent content) {
		this.content = content;
	}

	@Override
	public Tile put(TileContent content) throws Exception {
		//cannot overwrite content in tile; must return invalid tile exception
		/**
		 * @todo #3 return an exception indicating that the content of the tile cannot
		 *  be overwritten 
		 */
		throw new Exception();

	}

	@Override
	public TileContent content() {
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
