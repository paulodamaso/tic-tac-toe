package oddsandevens.move;

import game.move.Move;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

/**
 * <p> A valid {@link Move} for the odds and evens game.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensValidMove implements OddsAndEvensMove {
	
	private final Integer number;
	private final OddsAndEvensPlayerInMatch player;

	public OddsAndEvensValidMove(OddsAndEvensPlayerInMatch player, Integer number) {
		this.number = number;
		this.player = player;
	}

	@Override
	public OddsAndEvensPlayerInMatch player() {
		return this.player;
	}

	@Override
	public OddsAndEvensMatch perform()  {
		return new OddsAndEvensMatch(this.player.match(), this);
	}
	
	@Override
	public Integer number() {
		return this.number;
	}
}
