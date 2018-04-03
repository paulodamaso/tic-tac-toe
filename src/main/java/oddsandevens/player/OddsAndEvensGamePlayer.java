package oddsandevens.player;

import game.player.GamePlayer;
import oddsandevens.action.OddsAndEvensAction;

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
