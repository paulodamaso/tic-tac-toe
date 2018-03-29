package mock;

import game.match.Match;
import game.move.InvalidMove;
import game.move.Move;

public class MockInvalidMove extends InvalidMove {

	public MockInvalidMove(Move move) {
		super(move);
	}

	@Override
	public Match perform() {
		// TODO Auto-generated method stub
		return null;
	}

}
