package oddsandevens.player;

import game.move.Mover;
import game.player.GamePlayer;
import game.player.Player;
import oddsandevens.OddsAndEvensGame;

/**
 * <p> Interface for modeling an {@link Player} of an {@link OddsAndEvensGame}.
 * 
 * <p> Narrow the return type of  {@link #move()} to comply with specific odds and evens 
 * game and match needs This player is not tied to a specific match
 *  
 * @author paulodamaso
 *
 */
public final class OddsAndEvensGamePlayer implements GamePlayer {

	private final Player player;
	private final Mover mover;
	
	public OddsAndEvensGamePlayer(Player player, Mover mover) {
		this.player = player;
		this.mover = mover;
	}

	@Override
	public String name() {
		return this.player.name();
	}

	@Override
	public Mover mover() {
		return mover;
	}

}