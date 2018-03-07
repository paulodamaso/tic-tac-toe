package game.board.tile;

/**
 * <p> This interface represents a board tile.
 * 
 * @author paulodamaso
 *
 */
public interface Tile {

	public Tile put(TileContent content) throws Exception;
	public TileContent content() throws Exception;

}
