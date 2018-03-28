package oddsandevens.player;

import game.player.Player;
import oddsandevens.move.OddsAndEvensValidMove;

/**
 * <p> A player of the odds and evens game. 
 * 
 * @author paulodamaso
 *
 */
public abstract class OddsAndEvensPlayer implements Player {
	
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
	public abstract OddsAndEvensValidMove move();
}
