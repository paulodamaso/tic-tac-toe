package game.board.tile;

/**
 * <p> An empty {@link Tile}
 * @author paulodamaso
 *
 */
public interface EmptyTile extends Tile {

	@Override
	public default TileContent content() {
		return new EmptyContent();
	}
}
