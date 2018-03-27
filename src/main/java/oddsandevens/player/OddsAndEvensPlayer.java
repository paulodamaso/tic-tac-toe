package oddsandevens.player;

import game.move.Move;
import game.player.Player;

/**
 * <p> A player of the odds and evens game. 
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensPlayer implements Player {
	
	private final String name;
	private final boolean even;

	public OddsAndEvensPlayer(String name, boolean even) {
		this.name = name;
		this.even = even;
	}

	@Override
	public String name() {
		return this.name;
	}
	
	public boolean even() {
		return this.even;
	}

	@Override
	public Move move() {
		// how the hell do we move?
		//return a new OddsAndEvenMove, implemented by a subclass
		return null;
	}

}
