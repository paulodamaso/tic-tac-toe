package oddsandevens.action;

import game.action.ActionInMatch;
import game.match.Match;
import oddsandevens.match.OddsAndEvensMatch;

/**
 * <p> An odds and evens action in a match.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensActionInMatch implements ActionInMatch, OddsAndEvensAction {

	private final OddsAndEvensAction origin;
	private final OddsAndEvensMatch match;
	
	public OddsAndEvensActionInMatch(OddsAndEvensAction origin, OddsAndEvensMatch match) {
		this.origin = origin;
		this.match = match;
	}

	@Override
	public Match perform() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public OddsAndEvensActionInMatch evaluate() {
		//evaluate this action in the context of that match
		return new OddsAndEvensActionInMatch(origin.evaluate(), this.match);
	}

	@Override
	public Integer number() {
		// TODO Auto-generated method stub
		return null;
	}

}
