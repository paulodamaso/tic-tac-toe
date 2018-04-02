package oddsandevens.move.generator;

import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.move.OddsAndEvensValidMove;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

public class OddsAndEvensRandomNumberMoveGenerator implements OddsAndEvensMoveGenerator {
	
	@Override
	public OddsAndEvensMove create(OddsAndEvensPlayerInMatch player) {
		return new OddsAndEvensValidMove(player ,new Integer(new Double(Math.random() * 5).intValue()));
	}

}
