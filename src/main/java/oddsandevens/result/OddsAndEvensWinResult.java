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

	private final Integer evens;	
	private final Integer odds;
	private final OddsAndEvensPlayers winners;
	private final OddsAndEvensPlayers losers;
	
	public OddsAndEvensWinResult(OddsAndEvensPlayers winners, OddsAndEvensPlayers losers, Integer evens, Integer odds) {
		this.evens = evens;
		this.odds = odds;
		this.winners = winners;
		this.losers = losers;
	}
	
	public Integer evens() { return evens; }
	
	public Integer odds() { return odds; }

	@Override
	public MatchPlayers winners() {
		return this.winners;
	}

	@Override
	public MatchPlayers losers() {
		return this.losers;
	}
	
}
