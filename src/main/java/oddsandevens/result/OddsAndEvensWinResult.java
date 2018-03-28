package oddsandevens.result;

import game.result.WinResult;
import oddsandevens.player.OddsAndEvensPlayers;

public final class OddsAndEvensWinResult extends WinResult implements OddsAndEvensResult{

	private final Integer evens;
	private final Integer odds;
	
	public OddsAndEvensWinResult(OddsAndEvensPlayers winners, OddsAndEvensPlayers losers, Integer evens, Integer odds) {
		super(winners, losers);
		this.evens = evens;
		this.odds = odds;
	}
	
	public Integer evens() { return evens; }
	
	public Integer odds() { return odds; }
	
}
