package oldgame.result;

/**
 * <p> A partial result for a match, indicating a match whose which has already ended and its result {@link Result} is definitive.
 * 
 * @author paulodamaso
 *
 */
public interface Definitive extends Result {

	/* (non-Javadoc)
	 * @see game.result.Result#partial()
	 */
	@Override
	default boolean partial() {
		return false;
	}
}
