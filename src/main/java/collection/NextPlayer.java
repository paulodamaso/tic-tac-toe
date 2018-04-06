package collection;

import game.player.Player;

public final class NextPlayer<P extends Player> implements Player {
	
	private final Player origin;
	
	public NextPlayer(Players players) {
		this.origin = players.next();
	}

	@Override
	public String name() {
		return origin.name();
	}

}
