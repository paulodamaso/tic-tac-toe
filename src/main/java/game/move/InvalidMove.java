package game.move;

import game.Player;
import game.board.Board;

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
	public Board perform() {
		// TODO Auto-generated method stub
		return null;
	}
}
