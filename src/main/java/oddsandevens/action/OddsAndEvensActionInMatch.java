package oddsandevens.action;

import game.action.ActionInMatch;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

/**
 * <p> An odds and evens action in a match.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensActionInMatch implements ActionInMatch, OddsAndEvensAction {

	private final OddsAndEvensAction origin;
	private final OddsAndEvensPlayerInMatch player;
	
	public OddsAndEvensActionInMatch(OddsAndEvensAction origin, OddsAndEvensPlayerInMatch player) {
		this.origin = origin;
		this.player = player;
	}

	@Override
	public OddsAndEvensMatch perform() {
		return new OddsAndEvensMatch(origin, player);
	}
	
	public OddsAndEvensActionInMatch evaluate() {
		//evaluate this action in the context of that match
		return new OddsAndEvensActionInMatch(origin.evaluate(), this.player);
	}

	@Override
	public Integer number() {
		return this.origin.number();
	}

}
