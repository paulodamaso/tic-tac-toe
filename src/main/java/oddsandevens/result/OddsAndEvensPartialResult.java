package oddsandevens.result;

import game.player.NoPlayers;
import game.player.Players;
import game.result.Partial;

public class OddsAndEvensPartialResult implements Partial, OddsAndEvensResult {

	@Override
	public Players winners() {
		return new NoPlayers();
	}

	@Override
	public Players losers() {
		return new NoPlayers();
	}

}
