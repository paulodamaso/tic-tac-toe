package game.move;

import game.Player;

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
	public Move perform(Move move) {
		return this;
	}

	@Override
	public Player player() {
		return move.player();
	}
}
