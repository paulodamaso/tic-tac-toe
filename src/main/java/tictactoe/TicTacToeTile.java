package tictactoe;

import game.board.tile.Tile;
import game.board.tile.TileContent;

public final class TicTacToeTile implements Tile {
	
	private final TileContent content;
	
	public TicTacToeTile(TileContent content) {
		this.content = content;
	}

	@Override
	public Tile add(TileContent content) {
		// TODO Auto-generated method stub
		//cannot overwrite content in tile
		return null;
	}

	@Override
	public TileContent content() {
		return this.content;
	}

}
