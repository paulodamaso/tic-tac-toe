package game.board.tile;

/**
 * <p> This interface represents a board tile.
 * 
 * @author paulodamaso
 *
 */
public interface Tile {

	public Tile add(TileContent content);
	public TileContent content();

}
