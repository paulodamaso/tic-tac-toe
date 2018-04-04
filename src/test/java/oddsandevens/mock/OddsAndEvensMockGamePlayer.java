package oddsandevens.mock;

import oddsandevens.action.OddsAndEvensAction;
import oddsandevens.player.OddsAndEvensGamePlayer;

public final class OddsAndEvensMockGamePlayer extends OddsAndEvensGamePlayer {
	
	private final int number;

	public OddsAndEvensMockGamePlayer(int number) {
		super("Dummy");
		this.number = number;
	}

	@Override
	public OddsAndEvensAction act() {
		// TODO Auto-generated method stub
		return null;
	}

}
