package oldgame.board;

import oldgame.board.tile.InvalidTile;
import oldgame.board.tile.Tile;
import oldgame.board.tile.TileContent;
import oldgame.position.Position;
import oldgame.result.Result;

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

	/**
	 * <p> Check for ending conditions for this board.
	 * 
	 * @return result of the board 
	 */
	public Result check() throws Exception;
}
