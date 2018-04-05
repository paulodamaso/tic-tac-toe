package oldgame.board.tile;

/**
 * <p> An empty {@link Tile}. Each game rules must specify how an empty tile must
 * behave. 
 * 
 * @author paulodamaso
 *
 */
public interface EmptyTile extends Tile {

	@Override
	public default TileContent content() {
		return new EmptyContent();
	}
}
