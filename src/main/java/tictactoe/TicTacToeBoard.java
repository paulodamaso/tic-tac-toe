package tictactoe;

import java.util.HashMap;
import java.util.Map;

import game.board.Board;
import game.board.tile.Tile;
import game.move.Move;
import game.position.Position;

/**
 * <p> A tic tac toe game board.
 * @author paulodamaso
 *
 */
public final class TicTacToeBoard implements Board {
	
	private final Map<Position, Tile> tiles;
	
	public TicTacToeBoard(int size) {
		this.tiles = new HashMap<>();
	}

	@Override
	public Tile tile(Position position) {
		return tiles.get(position);
	}

	@Override
	public Board perform(Move move) {
		// TODO Auto-generated method stub
		return null;
	}

}
