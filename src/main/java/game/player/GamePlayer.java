package game.player;

import game.move.generator.MoveGenerator;

/**
 * <p> A {@link Player} of a game. This interface implementations must define
 * which {@link MoveGenerator} this player will use for a particular game type.
 * 
 * @author paulodamaso
 *
 */
public interface GamePlayer<P extends PlayerInMatch> extends Player {
	
	/**
	 * <p> Returns the {@link MoveGenerator} of this player.
	 * 
	 * @return
	 */
	public MoveGenerator<P> generator();

}
