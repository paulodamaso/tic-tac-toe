package oddsandevens.player;

import game.match.Match;
import game.move.Move;
import game.move.Mover;
import game.player.PlayerInMatch;
import oddsandevens.match.OddsAndEvensMatch;

/**
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensMatchPlayer implements PlayerInMatch {
	
	private OddsAndEvensGamePlayer gamePlayer;
	private boolean even;
	private OddsAndEvensMatch match;
	
	public OddsAndEvensMatchPlayer(OddsAndEvensGamePlayer gamePlayer, boolean even, OddsAndEvensMatch match ) {
		
	}

	@Override
	public Mover mover() {
		return gamePlayer.mover();
	}

	@Override
	public String name() {
		return gamePlayer.name();
	}

	@Override
	public Match match() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Move move() {
		return gamePlayer.mover().move();
	}

}
