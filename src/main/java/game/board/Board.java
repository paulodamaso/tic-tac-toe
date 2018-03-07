package game.board;

import game.board.tile.EmptyContent;
import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;
import game.position.Position;

/**
 * <p> Interface representing a game board.
 * 
 * @author paulodamaso
 *
 */
public interface Board {

	/**
	 * <p> The tile at {@link Position}.
	 * 
	 * @param position
	 * @return the tile located at the position sent; must return an {@link InvalidTile} with  
	 * {@link EmptyContent} if the position is outside board
	 */
	public Tile tile(Position position) ;
	
	public Board add(Position position, TileContent tileContent) throws Exception;
	
}
