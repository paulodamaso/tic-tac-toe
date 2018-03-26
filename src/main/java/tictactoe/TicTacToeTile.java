package tictactoe;

import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;

/**
 * <p> A tile abstraction in a tic tac toe game.
 * 
 * @author paulodamaso
 *
 */
public interface TicTacToeTile extends Tile {
	
	/**
	 * <p> Put content in an board tile.
	 * 
	 * @param content content to be put to this tile
	 * @return
	 * @throws Exception if some exception occurs in the operation, for example, if the tile
	 * is an {@link InvalidTile}.
	 */
	public TicTacToeTile put(TileContent content) throws Exception;

}
