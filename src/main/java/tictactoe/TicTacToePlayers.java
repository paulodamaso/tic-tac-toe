package tictactoe;

import game.Player;
import game.Players;

public final class TicTacToePlayers implements Players {
	
	private final Player player;
	
	public TicTacToePlayers(TicTacToeTileContentImpl tileContent) {
		this.player = tileContent.player();
	}

	@Override
	public Player next() {
		return player;
	}

}
