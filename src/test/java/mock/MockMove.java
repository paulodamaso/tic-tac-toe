package mock;

import game.action.Action;
import game.player.PlayerInMatch;

/**
 * <p> {@link Action} mock implementation for testing only.
 * 
 * @author paulodamaso
 *
 */
public final class MockMove implements Action {
	
	private final PlayerInMatch player;
	
	public MockMove(PlayerInMatch player) {
		this.player = player;
	}

	@Override
	public PlayerInMatch player() {
		return this.player;
	}

}
