package game;

import game.move.Move;

/**
 * <p> Class modeling a game type: tic-tac-toe, chess, checkers, etc. Should be static if it were a good pattern.
 * 
 * @author paulodamaso
 *
 */
public interface Game {

	public Move evaluate(Move move);
	
}
