package tictactoe;

import game.Game;
import game.board.Board;
import game.move.Move;
/**
 * <p> Represents the tic tac toe game game rules.
 *  
 * @author paulodamaso
 *
 */
public final class TicTacToeGame implements Game {
	
	//actual board of game
	private final Board board;

	public TicTacToeGame(Board board) {
		this.board = board;
	}

	@Override
	public Move evaluate(Move move) {
		//evaluate game rules
		//game rules:
		
		board.perform(occupied(inBoundary(move.tile()));
		//#1 you can't play outside board limits
		board.inBoundary(
				move.tile()
				);
		//#2 you can't play in a occupied tile
		board.occupied(
				move.tile()
				);
		//#3 perform the move
		return board.perform(move);
	}

}
