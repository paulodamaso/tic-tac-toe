package tictactoe;

import oldgame.board.tile.TileContent;
import oldgame.player.Player;

/**
 * <p> The content of a tic tac toe game tile. In this game, the content of a tile
 * is just a reference to the player which marked the tile.
 * 
 * @author paulodamaso
 *
 */
public final class TicTacToeTileContentImpl implements TicTacToeTileContent {

	private final Player player;
	
	public TicTacToeTileContentImpl(Player player) {
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
									(TicTacToeTileContentImpl)obj
							).player().name()
						)
					);
	}
	
}
