package tictactoe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import game.board.Board;
import game.board.tile.EmptyTile;
import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;
import game.position.BiDimensionalPosition;
import game.position.Position;

/**
 * <p> A tic tac toe game board.
 * 
 * <p> The board is populated with {@link EmptyTile}s in initialization.
 * 
 * @author paulodamaso
 *
 */
public final class TicTacToeBoard implements Board {
	
	private final Map<Position, Tile> tiles;
	
	public TicTacToeBoard(int size) {
		this(new HashMap<>(size*size));
		for (int i =0 ; i < size; i++) {
			for (int j =0 ; j < size; j++) {
				tiles.put(
						new BiDimensionalPosition(i, j),
						new TicTacToeEmptyTile()
						);
			}			
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tiles == null) ? 0 : tiles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicTacToeBoard other = (TicTacToeBoard) obj;

		if (tiles == null) {
			if (other.tiles != null)
				return false;
		} else if (!tiles.equals(other.tiles)
				) 
			return false;
		
		return true;
	}

	public TicTacToeBoard(Map<Position, Tile> tiles) {
		this.tiles = tiles;
	}

	@Override
	public Tile tile(Position position) {
		return tiles.get(position) != null ? tiles.get(position) : new InvalidTile(new TicTacToeEmptyTile());
	}

	public Collection<Tile> tiles() {
		return tiles.values();
	}

	@Override
	public TicTacToeBoard add(Position position, TileContent tileContent) throws Exception{
		tiles.put(position, tile(position).put(tileContent));
		return new TicTacToeBoard(tiles);
	}

}
