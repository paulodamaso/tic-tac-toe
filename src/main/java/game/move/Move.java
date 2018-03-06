package game.move;

import game.Player;
import game.board.Board;

/**
 * <p> Class representing the move made by a {@link Player}.
 * @author paulodamaso
 *
 */
public interface Move {

	/**
	 * <p> The player that made the move.
	 * @return
	 */
	public Player player();
	
	public Board perform();

}
