package tictactoe;

import game.player.Player;
import game.player.Players;

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
