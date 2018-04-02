package oddsandevens.move;

import game.Game;
import game.move.Move;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

/**
 * <p> An {@link Move} before being evaluated by the {@link Game} instance.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensUnevaluatedMove implements OddsAndEvensMove{
	
	private final OddsAndEvensPlayerInMatch player;
	private final Integer number;
	
	public OddsAndEvensUnevaluatedMove(OddsAndEvensPlayerInMatch player, Integer number) {
		this.player = player;
		this.number = number;
	}

	@Override
	public OddsAndEvensPlayerInMatch player() {
		return this.player;
	}

	@Override
	public OddsAndEvensMatch perform() {
		return this.player.match();
	}

	@Override
	public Integer number() {
		return this.number;
	}

}
