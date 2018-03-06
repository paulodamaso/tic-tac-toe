package game;

import game.match.Match;
import game.move.Move;

/**
 * <p> Class modeling a game type: tic-tac-toe, chess, checkers, etc. Should be static if it were a good pattern.
 * 
 * @author paulodamaso
 *
 */
public interface Game {

	/**
	 * <p> Create a new game match
	 * @return
	 */
	public Match newMatch();
	public Move evaluate(Move move);
	
}
