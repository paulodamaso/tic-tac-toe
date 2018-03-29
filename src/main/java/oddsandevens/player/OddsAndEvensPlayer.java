package oddsandevens.player;

import game.match.Match;
import game.player.Player;
import game.player.PlayerInMatch;
import oddsandevens.move.OddsAndEvensMove;

/**
 * <p> A player of the odds and evens game. 
 * 
 * @author paulodamaso
 *
 */
public abstract class OddsAndEvensPlayer implements PlayerInMatch {
	
	private final Player player;
	private final boolean even;
	private final Match match;

	public OddsAndEvensPlayer(Player player, boolean even, Match match) {
		this.player = player;
		this.even = even;
		this.match = match;
	}

	@Override
	public String name() {
		return this.player.name();
	}
	
	public boolean even() {
		return this.even;
	}
	
	public Match match() {
		return this.match;
	}
	
	public abstract OddsAndEvensMove move();

}
