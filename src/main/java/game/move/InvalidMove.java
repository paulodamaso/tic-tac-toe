package game.move;

import game.player.PlayerInMatch;

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
	public PlayerInMatch player() {
		return move.player();
	}

}
