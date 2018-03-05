package game.position;

/**
 * <p> A position representation.
 * 
 * @author paulodamaso
 *
 */
public final class BiDimensionalPosition implements Position {

	private final int x;
	private final int y; 
	
	public BiDimensionalPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() { return this.x; }
	public int y() { return this.y; }

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof BiDimensionalPosition == false) return false;
		return  equals(obj);
	}

	@Override
	public boolean equals(Position position) {
		BiDimensionalPosition pos = (BiDimensionalPosition)position;
		return ((this.x == pos.x())
				&& (this.y == pos.y()));		
	}

}
