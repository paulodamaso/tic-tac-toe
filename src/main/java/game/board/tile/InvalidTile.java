package game.board.tile;

/**
 * <p> An invalid tile
 * 
 * @author paulodamaso
 *
 */
public final class InvalidTile implements Tile {
	
	private final Tile tile;

	public InvalidTile(Tile tile) {
		this.tile = tile;
	}

	@Override
	public Tile put(TileContent content) {
		//this tile is invalid!!
		System.out.println("This tile is invalid! "+ tile);
		return new InvalidTile(tile);
	}

	@Override
	public TileContent content() {
		System.out.println("This is invalid!");
		return tile.content();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tile == null) ? 0 : tile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvalidTile other = (InvalidTile) obj;
		if (tile == null) {
			if (other.tile != null)
				return false;
		} else if (!tile.equals(other.tile))
			return false;
		return true;
	}

}
