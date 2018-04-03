package oddsandevens.move;

import game.move.EvaluatedMove;
import game.move.UnevaluatedMove;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

/**
 * <p> A {@link UnevaluatedMove} for a odds and evens game.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensUnevaluatedMove implements UnevaluatedMove, OddsAndEvensMove {
	
	private final OddsAndEvensPlayerInMatch player;
	
	public OddsAndEvensUnevaluatedMove(OddsAndEvensPlayerInMatch player) {
		this.player = player;
	}
	

	@Override
	public OddsAndEvensPlayerInMatch player() {
		return this.player;
	}

	@Override
	public EvaluatedMove evaluate() {
		if (number().intValue() >= 0 && number().intValue() <= 5) return newMove;
		return new OddsAndEvensInvalidMove(newMove);
	}

}
