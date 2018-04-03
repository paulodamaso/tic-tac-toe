package game.move;

import game.match.Match;

/**
 * <p> A move that had already been evaluated.
 * 
 * <p> This is just an upper-level interface for aggregating {@link Move}s that have already passed by
 * the {@link UnevaluatedMove#evaluate()} and are any instance of evaluated move implementation.
 * 
 * @author paulodamaso
 *
 */
public interface EvaluatedMove extends Move {

	/**
	 * <p> Perform the move an return the new {@link Match} with the move performed.
	 *  
	 * @return {@link Match} representing the match state after the move.
	 */
	public abstract Match perform() ;
		
}
