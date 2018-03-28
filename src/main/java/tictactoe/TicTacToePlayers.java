package tictactoe;

import game.player.Player;
import game.player.MatchPlayers;

public final class TicTacToePlayers implements MatchPlayers {
	
	private final Player player;
	
	public TicTacToePlayers(TicTacToeTileContentImpl tileContent) {
		this.player = tileContent.player();
	}

	@Override
	public Player next() {
		return player;
	}

}
