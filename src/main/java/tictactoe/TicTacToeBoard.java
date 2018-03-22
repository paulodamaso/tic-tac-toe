package tictactoe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import game.board.Board;
import game.board.tile.EmptyTile;
import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;
import game.match.Match;
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

	@Override
	public Match check() {
		if(tiles.get(new BiDimensionalPosition(0,0)).content().equals(
				new Object[] {tiles.get(new BiDimensionalPosition(0,1)), tiles.get(new BiDimensionalPosition(0,1))}
				)) {
		}
		//first row
		tiles.get(new BiDimensionalPosition(0,0));
		;
		tiles.get(new BiDimensionalPosition(0,2));
		//second row
		tiles.get(new BiDimensionalPosition(1,0));
		tiles.get(new BiDimensionalPosition(1,1));
		tiles.get(new BiDimensionalPosition(2,2));
		//thrid row
		tiles.get(new BiDimensionalPosition(2,0));
		tiles.get(new BiDimensionalPosition(2,1));
		tiles.get(new BiDimensionalPosition(2,2));
		//first column
		tiles.get(new BiDimensionalPosition(0,0));
		tiles.get(new BiDimensionalPosition(1,0));
		tiles.get(new BiDimensionalPosition(2,0));
		//second column
		tiles.get(new BiDimensionalPosition(0,1));
		tiles.get(new BiDimensionalPosition(1,1));
		tiles.get(new BiDimensionalPosition(2,1));
		//third column
		tiles.get(new BiDimensionalPosition(0,2));
		tiles.get(new BiDimensionalPosition(1,2));
		tiles.get(new BiDimensionalPosition(2,2));
		//left to right diagonal
		tiles.get(new BiDimensionalPosition(0,0));
		tiles.get(new BiDimensionalPosition(1,1));
		tiles.get(new BiDimensionalPosition(2,2));
		//right to left diagonal
		tiles.get(new BiDimensionalPosition(0,2));
		tiles.get(new BiDimensionalPosition(1,1));
		tiles.get(new BiDimensionalPosition(2,0));
		return null;

	}

}
