package tictactoe;

import game.Player;
import game.board.Board;
import game.move.Move;
import game.position.Position;

/**
 * <p> A tic tac toe move, where a player put his mark in a tile .
 * 
 * @author paulodamaso
 *
 */
public final class TicTacToeMove implements Move {
	
//	private final Move move;
	private final Player player;
	private final Position position;
	private final Board board;

	public TicTacToeMove(Move move, Player player, Position position, Board board) {
//		this.move = move;
		this.player = player;
		this.position = position;
		this.board = board;
	}

	@Override
	public Player player() {
		return this.player;
	}
	
	public Position position() {
		return this.position;
	}

	@Override
	public Move perform() {
		return 
				new TicTacToeMove(
				this.player, 
				this.position, 
				board.perform (
						new TicTacToeMove(player, position, board)
						board.tile(
						this.position
						).put(
						new TicTacToeTileContent(this.player)
						)
					);
	}

}
