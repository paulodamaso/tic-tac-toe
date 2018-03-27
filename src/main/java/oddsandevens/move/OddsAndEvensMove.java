package oddsandevens.move;

import game.match.Match;
import game.move.Move;
import game.player.Player;
import oddsandevens.match.OddsAndEvensMatch;

/**
 * <p> A {@link Move} for the odds and evens game.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensMove implements Move {
	
	private final Integer number;
	private final Player player;
	private final OddsAndEvensMatch match;

	public OddsAndEvensMove(Integer number, Player player, OddsAndEvensMatch match) {
		this.number = number;
		this.player = player;
		this.match = match;
	}

	@Override
	public Player player() {
		return this.player;
	}

	@Override
	public Match perform() throws Exception {
		//in the perform method this move must create a new match, adding itself
		return new OddsAndEvensMatch(match.players(), this);
	}
	
	public Integer number() {
		return this.number;
	}

}
