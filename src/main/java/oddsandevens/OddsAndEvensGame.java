package oddsandevens;

import game.Game;
import game.move.InvalidMove;
import game.move.Move;
import oddsandevens.move.OddsAndEvensInvalidMove;
import oddsandevens.move.OddsAndEvensMove;

/**
 * <p> A odds and evens game. This game models the rules of odds and evens moves.
 * 
 * <p> Evaluating a move: the odds and evens game has the following rule for a move:
 * <ul>
 * 	<li>the value of a move must be between 0 and 5 (at least for humans players playing with just one hand) </li>
 * </ul>
 * Anything different from this move must be considered an {@link InvalidMove}.  
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensGame implements Game {
	
	/**
	 * <p> Evaluation of a {@link OddsAndEvensMove} implementation
	 * 
	 * @return evaluated {@link OddsAndEvensMove}: {@link OddsAndEvensValidMove} or {@link OddsAndEvensInvalidMove}
	 */
	public OddsAndEvensMove evaluate(Move move) {
		OddsAndEvensMove newMove = (OddsAndEvensMove)move;
		if (newMove.number().intValue() >= 0 && newMove.number().intValue() <= 5) return newMove;
		return new OddsAndEvensInvalidMove(newMove);
	}


}
