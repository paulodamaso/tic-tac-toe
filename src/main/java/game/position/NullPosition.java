package game.position;

/**
 * <p> Represents an null / invalid position.
 * @author paulodamaso
 *
 */
public interface NullPosition extends Position {

	public default boolean equals(Position position) {
		return false;
	}

}
