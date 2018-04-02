package oddsandevens.move;

import game.move.InvalidMove;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

public final class OddsAndEvensInvalidMove extends InvalidMove implements OddsAndEvensMove {
	
	private final OddsAndEvensMove move;

	public OddsAndEvensInvalidMove(OddsAndEvensMove move) {
		super(move);
		this.move = move;
	}
	
	@Override
	public OddsAndEvensPlayerInMatch player() {
		return move.player();
	}

	@Override
	public OddsAndEvensMatch perform() {
		//this move is invalid and cannot be performed
//		throw new Exception("This move is invalid and cannot be performed!");
		//what it should do? call another move for the player oven and over?	
		return this.move.player().match();
	}

	@Override
	public Integer number() {
		return move.number();
	}
}
