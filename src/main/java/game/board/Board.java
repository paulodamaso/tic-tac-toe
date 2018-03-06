package game.board;

import java.util.Collection;

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
	 * @return the tile located at the position sent
	 */
	public Tile tile(Position position) ;
	
	/**
	 * <p> Perform the move.
	 * 
	 * @param move
	 * @return the the new board with the performed {@link Move}
	 */
	public Board perform (Move move);
	
	/**
	 * <p> Return the tiles within the board
	 * 
	 * @return
	 */
	public Collection<Tile> tiles();
}
