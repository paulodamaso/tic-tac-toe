package tictactoe;

import game.Player;
import game.board.tile.TileContent;

/**
 * <p> The content of a tic tac toe game tile.
 * @author paulodamaso
 *
 */
public final class TicTacToeTileContent implements TileContent {

	private Player player;
	
	public TicTacToeTileContent(Player player) {
		this.player = player;
	}
	
	public Player player () {
		return this.player;
	}
	
	@Override
	public boolean equals(Object obj) {
		return 
			player.name().contentEquals(
					new StringBuffer(
							(
									(TicTacToeTileContent)obj
							).player().name()
						)
					);
	}
	
}
