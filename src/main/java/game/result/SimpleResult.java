package game.result;

import java.util.Collection;

import game.Player;

/**
 * <p> Simple match result.
 * 
 * @author paulodamaso
 *
 */
public final class SimpleResult implements Result {

	private final Collection<Player> winners;
	private final Collection<Player> losers;
	
	public SimpleResult(Collection<Player> winners, Collection<Player> losers) {
		this.winners = winners;
		this.losers = losers;
	}

	@Override
	public Collection<Player> winners() {
		return this.winners;
	}

	@Override
	public Collection<Player> losers() {
		return this.losers;
	}

}
