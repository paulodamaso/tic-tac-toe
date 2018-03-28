package oddsandevens.player;

import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.move.OddsAndEvensValidMove;

public final class OddsAndEvensComputerPlayer extends OddsAndEvensPlayer {
	
	private final OddsAndEvensMatch match;
	
	public OddsAndEvensComputerPlayer(String name, boolean even, OddsAndEvensMatch match) {
		super(name, even);
		this.match = match;
	}

	@Override
	public OddsAndEvensValidMove move() {
		return new OddsAndEvensValidMove(new Double(Math.random() * 5).intValue(), this, this.match);
	}

}
