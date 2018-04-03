package mock;

import game.move.Move;
import game.player.PlayerInMatch;

/**
 * <p> {@link Move} mock implementation for testing only.
 * 
 * @author paulodamaso
 *
 */
public final class MockMove implements Move {
	
	private final PlayerInMatch player;
	
	
	public MockMove(PlayerInMatch player) {
		this.player = player;
	}

	@Override
	public PlayerInMatch player() {
		return this.player;
	}

}
