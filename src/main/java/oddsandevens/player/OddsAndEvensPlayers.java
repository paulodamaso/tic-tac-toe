package oddsandevens.player;

import game.player.Player;
import game.player.Players;

/**
 * <p> Odds and even {@link Player} set.
 * 
 * @author paulodamaso
 *
 */
/*
 *  @todo #7 make this class immutable
 */
public final class OddsAndEvensPlayers implements Players {
	
	private final OddsAndEvensPlayer[] players;
	private boolean turn = false;

	public OddsAndEvensPlayers(OddsAndEvensPlayer...player) {
		this.players = player; 
	}

	public OddsAndEvensPlayer next() {
		turn = !turn;
		return players[(turn ? 0 : 1)];
	}

	@Override
	public Player previous() {
		return players[(turn ? 0 : 1)];
	}
}
