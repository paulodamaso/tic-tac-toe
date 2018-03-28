package game.move;

import game.player.Player;

/**
 * <p> Decorator for saying that this move is invalid.
 * 
 * @author paulodamaso
 *
 */
public abstract class InvalidMove implements Move {
	
	private final Move move;

	public InvalidMove(Move move) {
		this.move = move;
	}

	@Override
	public Player player() {
		return move.player();
	}

}
