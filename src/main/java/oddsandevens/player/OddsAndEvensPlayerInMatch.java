package oddsandevens.player;

import game.player.PlayerInMatch;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.move.OddsAndEvensMove;

/**
 * <p> A player in an odds and evens match.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensPlayerInMatch implements PlayerInMatch {
	
	private final OddsAndEvensGamePlayer player;
	private final OddsAndEvensMatch match;
	
	public OddsAndEvensPlayerInMatch(OddsAndEvensGamePlayer gamePlayer, OddsAndEvensMatch match ) {
		this.player = gamePlayer;

		this.match = match;
	}

	@Override
	public String name() {
		return player.name();
	}

	@Override
	public OddsAndEvensMatch match() {
		return this.match;
	}

	@Override
	public OddsAndEvensMove move() {
		return player.generator().create(this);
	}

}
