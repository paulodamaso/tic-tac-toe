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
	
	/**
	 * <p> Add content to a tile position in board.
	 *  
	 * @param position the position of the tile to have content added
	 * @param tileContent content to be added
	 * @return new board configuration
	 * @throws Exception if some exception is raised in the process
	 */
	public Board add(Position position, TileContent tileContent) throws Exception;
	
}
