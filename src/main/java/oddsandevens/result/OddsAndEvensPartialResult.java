package oddsandevens.result;

import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayers;
import oldgame.player.MatchPlayers;
import oldgame.result.Partial;

/**
 * <p> Partial result for an odds and evens match. Since these game does not allow
 *  partial results (we can't tell who's winning a match until its end) it
 *  returns {@link NoPlayers} in each of its methods which return {@link MatchPlayers} instances. 
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensPartialResult implements Partial, OddsAndEvensResult {
	
	private final OddsAndEvensMatch match;
	
	public OddsAndEvensPartialResult(OddsAndEvensMatch match) {
		this.match = match;
	}

	@Override
	public OddsAndEvensPlayers winners() {
		return new OddsAndEvensPlayers(null);
	}


	@Override
	public OddsAndEvensPlayers losers() {
		return new OddsAndEvensPlayers(null);
	}

}
