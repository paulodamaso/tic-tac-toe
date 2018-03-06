package tictactoe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import game.board.Board;
import game.board.tile.EmptyTile;
import game.board.tile.InvalidTile;
import game.board.tile.Tile;
import game.move.Move;
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
	
	public TicTacToeBoard(Map<Position, Tile> tiles) {
		this.tiles = tiles;
	}

	@Override
	public Tile tile(Position position) {
		return tiles.get(position) != null ? tiles.get(position) : new InvalidTile(new TicTacToeEmptyTile());
	}

	@Override
	public Board perform(Move move) {
		//who says that this move is valid?
		
		
		TicTacToeMove tttm = (TicTacToeMove)move;
		tiles.put(
				tttm.position(),
				tile(
						tttm.position()
					).put(
						new TicTacToeTileContent(
						tttm.player()
						)
					)
				)
;
		return new TicTacToeBoard(tiles);

	}

	@Override
	public Collection<Tile> tiles() {
		return tiles.values();
	}

}
