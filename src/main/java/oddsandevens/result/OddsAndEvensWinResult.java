package oddsandevens.result;

import game.player.MatchPlayers;
import game.result.Definitive;
import oddsandevens.player.OddsAndEvensPlayers;

/**
 * <p> A result of an odds and evens game with win condition for one player. This result receives
 * the evens and the odds scores (the match moves). 
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensWinResult implements OddsAndEvensResult, Definitive{

	private final OddsAndEvensPlayers winners;
	private final OddsAndEvensPlayers losers;
	
	public OddsAndEvensWinResult(OddsAndEvensPlayers winners, OddsAndEvensPlayers losers) {
		this.winners = winners;
		this.losers = losers;
	}
	
	@Override
	public MatchPlayers winners() {
		return this.winners;
	}

	@Override
	public MatchPlayers losers() {
		return this.losers;
	}
	
}
