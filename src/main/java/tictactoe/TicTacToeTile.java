package tictactoe;

import game.board.tile.Tile;
import game.board.tile.TileContent;

public final class TicTacToeTile implements Tile {
	
	private final TileContent content;
	
	public TicTacToeTile(TileContent content) {
		this.content = content;
	}

	@Override
	public Tile put(TileContent content) throws Exception {
		//cannot overwrite content in tile; must return invalid tile exception
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
