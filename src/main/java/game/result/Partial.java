package game.result;

/**
 * <p> A partial result for a match
 * @author paulodamaso
 *
 */
public interface Partial extends Result {

	@Override
	public default boolean partial() {
		return true;
	}

}
