package tictactoe;

import game.board.tile.TileContent;
import game.player.Player;

public interface TicTacToeTileContent extends TileContent {
	
	public Player player();

}
