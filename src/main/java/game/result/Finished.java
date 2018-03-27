package game.result;

public interface Finished extends Result {

	@Override
	default boolean partial() {
		return false;
	}

	
}
