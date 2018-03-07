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
	public Tile put(TileContent content) throws Exception{
		//this tile is invalid!!
		System.out.println();
		throw new Exception("This tile is invalid! "+ tile);
//		return new InvalidTile(tile);
	}

	@Override
	public TileContent content() throws Exception{
		System.out.println("This is invalid!");
		throw new Exception("This tile is invalid! "+ tile);
//		return tile.content();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + 0;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof InvalidTile;
	}

}
