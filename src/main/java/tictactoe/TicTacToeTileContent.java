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
	
}
