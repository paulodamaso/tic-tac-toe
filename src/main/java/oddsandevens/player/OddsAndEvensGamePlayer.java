package oddsandevens.player;

import oddsandevens.action.OddsAndEvensAction;
import oldgame.player.GamePlayer;

public abstract class OddsAndEvensGamePlayer implements GamePlayer {
	
	private final String name;

	public OddsAndEvensGamePlayer(String name) {
		this.name = name;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public abstract OddsAndEvensAction act(); 

}
