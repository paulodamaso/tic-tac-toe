package game.move;

import game.Player;
import game.match.Match;

/**
 * <p> Decorator for saying that this move is invalid.
 * 
 * @author paulodamaso
 *
 */
public final class InvalidMove implements Move {
	
	private final Move move;

	public InvalidMove(Move move) {
		this.move = move;
	}

	@Override
	public Player player() {
		return move.player();
	}

	@Override
	public Match perform() throws Exception{
		//this move is invalid and cannot be performed
		throw new Exception("This move is invalid and cannot be performed!");
	}
}
