package tictactoe;

import game.Game;
import game.Player;
import game.board.BiDimensionalBoard;
import game.board.Board;
import game.match.Match;
import game.move.Move;

/**
 * <p> Class representing a match of tic-tac-toe.
 * 
 * @author paulodamaso
 *
 */
public final class BiDimensionalTicTacToeMatch implements Match {
	
	private final Player circles;
	private final Player crosses;
	
	//class of the game being played
	private final TicTacToeGame game;
	
	//the current game board
	private final BiDimensionalBoard board;

	public BiDimensionalTicTacToeMatch(Player circle, Player cross, int size) {
		this.circles = circle;
		this.crosses = cross;		
		this.board = new BiDimensionalBoard(size, size);
		this.game = new TicTacToeGame(this.board);
	}
	
	public Move move(Move move) {
		//game rules
		//game validate move (according to game rules and board configuration)		
		game.evaluate(move);
		
		//player executes move
		
		return null;
	}

	@Override
	public Move addMove(Player player, Move move) {
		// TODO Auto-generated method stub
		return null;
	}

}
