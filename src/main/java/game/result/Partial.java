package game.result;

/**
 * <p> A partial result for a match, indicating a match whose {@link Result} is not definitive and
 * have not finished yet.
 * 
 * See {@see Result} for rules about instantiating {@link Partial} instances. 
 * 
 * @author paulodamaso
 *
 */
public interface Partial extends Result {

	/* (non-Javadoc)
	 * @see game.result.Result#partial()
	 */
	@Override
	public default boolean partial() {
		return true;
	}
}
