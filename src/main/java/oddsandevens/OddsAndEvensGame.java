package oddsandevens;

import game.Game;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.move.OddsAndEvensInvalidMove;
import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.player.OddsAndEvensComputerPlayer;

/**
 * <p> A wrapper for a {@link OddsAndEvensMatch}
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensGame implements Game<OddsAndEvensMove> {
	
	private OddsAndEvensMatch match;
	
	public OddsAndEvensGame() {
		this.match = new OddsAndEvensMatch(
				new OddsAndEvensComputerPlayer("Player One", true, this.match),
				new OddsAndEvensComputerPlayer("Player Two", false, this.match));
	}

	@Override
	public OddsAndEvensMatch play() {
		OddsAndEvensMatch match = null;
		do {
			match = evaluate(this.match.players().next().move()).perform();
		}while(match.result().partial()) ;

		return match;
	}
	
	@Override
	public OddsAndEvensMove evaluate(OddsAndEvensMove move) {
		if (move.number() >= 0 && move.number() <= 5) return move;
		return new OddsAndEvensInvalidMove(move);
	}

}
