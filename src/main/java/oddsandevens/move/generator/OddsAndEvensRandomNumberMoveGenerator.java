package oddsandevens.move.generator;

import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.move.OddsAndEvensUnevaluatedMove;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

public class OddsAndEvensRandomNumberMoveGenerator implements OddsAndEvensMoveGenerator {
	
	@Override
	public OddsAndEvensMove create(OddsAndEvensPlayerInMatch player) {
		return new OddsAndEvensUnevaluatedMove(player ,new Double(Math.random() * 5).intValue());
	}

}
