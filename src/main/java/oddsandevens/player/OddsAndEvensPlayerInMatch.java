package oddsandevens.player;

import game.player.PlayerInMatch;
import oddsandevens.action.OddsAndEvensActionInMatch;
import oddsandevens.match.OddsAndEvensMatch;

/**
 * <p> Decorator for 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensPlayerInMatch implements PlayerInMatch {
	
	private final OddsAndEvensGamePlayer player;
	private final OddsAndEvensMatch match;
	
	
	public OddsAndEvensPlayerInMatch(OddsAndEvensGamePlayer player, OddsAndEvensMatch match) {
		this.player = player;
		this.match = match;
	}

	@Override
	public OddsAndEvensMatch match() {
		return this.match;
	}

	@Override
	public OddsAndEvensActionInMatch act() {
		return new OddsAndEvensActionInMatch(player.act(), this.match);
	}

	@Override
	public String name() {
		return this.player.name();
	}

}
