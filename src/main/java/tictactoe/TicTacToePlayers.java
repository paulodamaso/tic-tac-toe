package tictactoe;

import oldgame.player.MatchPlayers;
import oldgame.player.Player;

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
