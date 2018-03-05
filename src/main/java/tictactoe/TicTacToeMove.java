package tictactoe;

import game.Player;
import game.board.tile.Tile;
import game.move.Move;

/**
 * <p> A tic tac toe move, where a player put his mark in a tile.
 * @author paulodamaso
 *
 */
public final class TicTacToeMove implements Move {
	
	private final Player player;
	private final Tile tile;

	public TicTacToeMove(Player player, Tile tile) {
		this.player = player;
		this.tile = tile;
	}
	
	public boolean valid (BiDimensionalTicTacToeBoard board) {
		
	}

}
