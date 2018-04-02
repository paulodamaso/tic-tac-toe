package oddsandevens.player;

import game.player.MatchPlayers;
import game.player.Player;
import oddsandevens.match.OddsAndEvensMatch;

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
	
	private OddsAndEvensPlayerInMatch[] players;
	private boolean turn = false;

	public OddsAndEvensPlayers(OddsAndEvensMatch match, OddsAndEvensGamePlayer...player) {
		this.players = {
			new OddsAndEvensPlayerInMatch(player[0], match),
			new OddsAndEvensPlayerInMatch(player[0], match)}; 
		
	}

	public OddsAndEvensPlayerInMatch next() {
		turn = !turn;
		return players[(turn ? 0 : 1)];
	}

	@Override
	public OddsAndEvensPlayerInMatch previous() {
		return players[(turn ? 0 : 1)];
	}
}
