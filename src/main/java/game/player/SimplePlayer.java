package game.player;

/**
 * <p> Simplest implementation of a {@link Player}.
 * 
 * @author paulodamaso
 *
 */
public final class SimplePlayer implements Player {

	private final String name;

	public SimplePlayer(String name) {
		this.name = name;
	}

	@Override
	public String name() {
		return this.name;
	}
}
