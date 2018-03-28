package oddsandevens.move;

import game.move.InvalidMove;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayer;

public final class OddsAndEvensInvalidMove extends InvalidMove implements OddsAndEvensMove {
	
	private final OddsAndEvensMove move;

	public OddsAndEvensInvalidMove(OddsAndEvensMove move) {
		super(move);
		this.move = move;
	}
	
	@Override
	public OddsAndEvensPlayer player() {
		return move.player();
	}

	@Override
	public OddsAndEvensMatch perform() {
		//this move is invalid and cannot be performed
//		throw new Exception("This move is invalid and cannot be performed!");
		return new OddsAndEvensMatch(move.match(), move.player().move());
	}

	@Override
	public OddsAndEvensMatch match() {
		return move.match();
	}

	@Override
	public Integer number() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
