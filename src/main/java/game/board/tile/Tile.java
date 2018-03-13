package game.board.tile;

/**
 * <p> This interface represents a board tile.
 * 
 * @author paulodamaso
 *
 */
public interface Tile {

	/**
	 * <p> Put content in an board tile.
	 * 
	 * @param content content to be put to this tile
	 * @return
	 * @throws Exception if some exception occurs in the operation, for example, if the tile
	 * is an {@link InvalidTile}.
	 */
	public Tile put(TileContent content) throws Exception;
	
	/**
	 * <p> The content of this tile.
	 * 
	 * @return the content of this tile
	 * @throws Exception if some exception occurs in the operation, for example, if the tile
	 * is an {@link InvalidTile}.
	 */
	public TileContent content() throws Exception;

}
