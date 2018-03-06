package tictactoe;

import game.board.tile.EmptyTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;

/**
 * <p> An empty tile for a tic tac toe game
 * @author paulodamaso
 *
 */

public class TicTacToeEmptyTile implements EmptyTile {

	@Override
	public Tile add(TileContent content) {
		return new TicTacToeTile(content);
	}

}
