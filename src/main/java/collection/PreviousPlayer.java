package collection;

import game.player.Player;

public class PreviousPlayer implements Player {

	private final Player origin;
	
	public PreviousPlayer(Players players) {
		this.origin = players.next();
	}
	@Override
	public String name() {
		return this.origin.name();
	}

}
