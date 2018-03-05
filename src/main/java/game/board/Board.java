package game.board;

import game.board.tile.EmptyTile;
import game.board.tile.OutOfBoundaryTile;
import game.board.tile.Tile;
import game.move.InvalidMove;
import game.move.Move;
import game.position.Position;

/**
 * <p> Interface representing a game board.
 * 
 * @author paulodamaso
 * @param <P>
 *
 */
public interface Board<T extends Tile<P>, P extends Position, M extends Move> {

	/**
	 * <p> The tile is in my boundaries?
	 * @param tile
	 * @return the tile or {@link OutOfBoundaryTile} if it is out of the board boundaries
	 */
	public T inBoundary (T tile);
	
	/**
	 * <p> The tile is empty or occupied?
	 * @param tile
	 * @return the tile or {@link EmptyTile} if this tile is empty
	 */
	public boolean empty(T tile);
	
	/**
	 * <p> Perform the move.
	 * 
	 * @param move
	 * @return the move performed or {@link InvalidMove} if it is invalid
	 */
	public M perform (M move);
}
