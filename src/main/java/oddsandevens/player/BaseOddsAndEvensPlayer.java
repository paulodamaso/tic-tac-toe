package oddsandevens.player;

import game.player.PlayerInMatch;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.move.OddsAndEvensMove;

/**
 * <p> A simple wrapper for an odds and evens player 
 * 
 * @author paulodamaso
 *
 */
public final class BaseOddsAndEvensPlayer implements PlayerInMatch {
	
	private final OddsAndEvensGamePlayer player;

	public BaseOddsAndEvensPlayer(OddsAndEvensGamePlayer player) {
		this.player = player;
	}

	@Override
	public String name() {
		return this.player.name();
	}
	
	public boolean even() {
		return this.player.even();
	}
	
	public OddsAndEvensMatch match() {
		return this.player.match();
	}
	
	public OddsAndEvensMove move() {
		return player.move();
	};

}
