package game.board.tile;

/**
 * <p> The content of a {@link Tile}
 * @author paulodamaso
 *
 */
public interface TileContent {

	@Override
	public boolean equals(Object obj);
	
	public default boolean equals(Object...objects ) {
		for (Object obj : objects) {
			if (!equals(obj)) return false;
		}
		return true;
	}

}
