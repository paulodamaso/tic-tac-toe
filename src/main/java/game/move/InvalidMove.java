package game.move;

import game.Game;
import game.match.Match;
import game.player.PlayerInMatch;

/**
 * <p> Decorator for defining a move as invalid. 
 * 
 * <p> Invalid moves are moves which are prohibited by game rule moves. They are created by {@link Game#evaluate(Move)} method, 
 * decorating the original move. They do not perform, returning the same {@link Match} associated with its origin {@link Move}.
 * 
 * <p> This class must be  instantiated for each game, allowing game specific invalid moves. 
 * 
 * @author paulodamaso
 *
 */
public abstract class InvalidMove implements Move {
	
	private final Move origin;

	public InvalidMove(Move origin) {
		this.origin = origin;
	}

	@Override
	public PlayerInMatch player() {
		return origin.player();
	}
	
	@Override
	public Match perform() {
		return origin.player().match();
	}

	@Override
	public Match match() {
		return origin.player().match();
	}
	
	

}
