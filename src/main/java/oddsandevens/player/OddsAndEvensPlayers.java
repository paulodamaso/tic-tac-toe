package oddsandevens.player;

import game.player.MatchPlayers;
import game.player.Player;

/**
 * <p> Odds and even {@link Player} set.
 * 
 * @author paulodamaso
 *
 */
/*
 *  @todo #7 make this class immutable
 */
public final class OddsAndEvensPlayers implements MatchPlayers {
	
	private final OddsAndEvensMatchPlayer[] players;
	private boolean turn = false;

	public OddsAndEvensPlayers(OddsAndEvensMatchPlayer...player) {
		this.players = player; 
	}

	public OddsAndEvensMatchPlayer next() {
		turn = !turn;
		return players[(turn ? 0 : 1)];
	}

	@Override
	public OddsAndEvensMatchPlayer previous() {
		return players[(turn ? 0 : 1)];
	}
}
