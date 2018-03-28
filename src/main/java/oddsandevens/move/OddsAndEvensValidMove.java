package oddsandevens.move;

import game.move.Move;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayer;

/**
 * <p> A {@link Move} for the odds and evens game.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensValidMove implements OddsAndEvensMove {
	
	private final Integer number;
	private final OddsAndEvensPlayer player;
	private final OddsAndEvensMatch match;

	public OddsAndEvensValidMove(Integer number, OddsAndEvensPlayer player, OddsAndEvensMatch match) {
		this.number = number;
		this.player = player;
		this.match = match;
	}

	@Override
	public OddsAndEvensPlayer player() {
		return this.player;
	}

	@Override
	public OddsAndEvensMatch perform()  {
		return new OddsAndEvensMatch(this.match, this);
	}
	
	@Override
	public Integer number() {
		return this.number;
	}
	
	@Override
	public OddsAndEvensMatch match() {
		return this.match;
	}

}
