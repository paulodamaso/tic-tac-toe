package tictactoe;

import game.board.tile.InvalidTile;
import game.board.tile.TileContent;

public class TicTacToeInvalidTile implements InvalidTile, TicTacToeTile {

	public TicTacToeInvalidTile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileContent content() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicTacToeTile put(TileContent content) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
