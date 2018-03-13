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
		/**
		 * @todo #3 return an invalid tile exception 
		 */		
		throw new Exception("This tile is invalid! "+ tile);
	}

	@Override
	public TileContent content() throws Exception{
		System.out.println("This is invalid!");
		/**
		 * @todo #3 return an invalid tile exception 
		 */
		throw new Exception("This tile is invalid! "+ tile);
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
