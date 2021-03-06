package tictactoe;

import oldgame.board.tile.EmptyTile;
import oldgame.board.tile.TileContent;

/**
 * <p> An empty tile for a tic tac toe game
 * @author paulodamaso
 *
 */

public final class TicTacToeEmptyTile implements EmptyTile, TicTacToeTile {

	@Override
	public TicTacToeTile put(TileContent content) {
		return new TicTacToeTileImp(content);
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof EmptyTile;
	}
	
	@Override
	public int hashCode() {
		return 15;
	}

	@Override
	public TicTacToeTileContentImpl content() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
