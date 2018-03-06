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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		BiDimensionalPosition other = (BiDimensionalPosition) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
