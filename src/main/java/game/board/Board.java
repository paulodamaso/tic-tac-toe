package game.board;

import game.board.tile.Tile;
import game.move.Move;
import game.position.Position;

/**
 * <p> Interface representing a game board.
 * 
 * @author paulodamaso
 *
 */
public interface Board {

	/**
	 * <p> The tile at {@link Position}.
	 * @param position
	 * @return
	 */
	public Tile tile(Position position);
	
	/**
	 * <p> Perform the move.
	 * 
	 * @param move
	 * @return the the new board with the performed {@link Move}
	 */
	public Board perform (Move move);
}
