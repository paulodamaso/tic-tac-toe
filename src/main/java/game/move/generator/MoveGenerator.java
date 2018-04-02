package game.move.generator;

import game.match.Match;
import game.move.Move;
import game.move.UnevaluatedMove;
import game.player.PlayerInMatch;

/**
 * <p> Generator that creates {@link Move}s for a {@link Match}.
 * 
 * @author paulodamaso
 *
 */
public interface MoveGenerator<P extends PlayerInMatch> {

	/**
	 * <p> Create an {@link UnevaluatedMove} for a match, for the player sent.
	 * @param player
	 * @return
	 */
	public UnevaluatedMove create(P player);
}
