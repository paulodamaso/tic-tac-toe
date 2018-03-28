package game.result;

/**
 * <p> A partial result for a match, indicating a match whose which has already ended and its result {@link Result} is definitive.
 * 
 * @author paulodamaso
 *
 */
public interface Definitive extends Result {

	@Override
	default boolean partial() {
		return false;
	}
}
