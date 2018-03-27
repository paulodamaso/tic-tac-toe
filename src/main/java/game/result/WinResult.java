package game.result;

import game.Players;

/**
 * <p> A result in which someone won the game.
 * 
 * @author paulodamaso
 *
 */
public final class WinResult implements Finished {
	
	private final Players winners;
	private final Players losers; 

	public WinResult(Players winners, Players losers) {
		this.winners = winners;
		this.losers = losers;
	}

	@Override
	public Players winners() {
		return this.winners;
	}

	@Override
	public Players losers() {
		return this.losers;
	}

}
