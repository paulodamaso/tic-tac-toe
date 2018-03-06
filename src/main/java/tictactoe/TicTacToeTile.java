package tictactoe;

import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;

public final class TicTacToeTile implements Tile {
	
	private final TileContent content;
	
	public TicTacToeTile(TileContent content) {
		this.content = content;
	}

	@Override
	public Tile put(TileContent content) {
		//cannot overwrite content in tile; must return invalid tile exception
		return new InvalidTile(this);
	}

	@Override
	public TileContent content() {
		return this.content;
	}
	
	@Override
	public boolean equals(Object obj) {
		TileContent tileContent = ((Tile)obj).content();
		return content.equals(tileContent);
	}

}
