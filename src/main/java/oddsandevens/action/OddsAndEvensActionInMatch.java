package oddsandevens.action;

import game.action.ActionInMatch;
import game.match.Match;
import game.player.Player;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

/**
 * <p> An odds and evens action associated to a match.
 * 
 * <p> Uses the {@link Match} stored in {@link Player} 
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
		return new OddsAndEvensActionInMatch(origin.evaluate(), this.player);
	}

	@Override
	public Integer number() {
		return this.origin.number();
	}

}
