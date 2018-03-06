package tictactoe;

import game.Game;
import game.Player;
import game.board.Board;
import game.match.Match;
import game.move.Move;

/**
 * <p> Class representing a match of tic-tac-toe.
 * 
 * @author paulodamaso
 *
 */
public final class TicTacToeMatch implements Match {
	
	private final Player circles;
	private final Player crosses;
	
	//class of the game being played
	private final TicTacToeGame game;
	
	//the current game board
	private final Board board;

	public TicTacToeMatch(Player circle, Player cross, int size) {
		this.circles = circle;
		this.crosses = cross;		
		this.board = new TicTacToeBoard(size);
		this.game = new TicTacToeGame(this.board);
	}

	@Override
	public Game game() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Match move(Move move) {
		// TODO Auto-generated method stub
		return null;
	}


}
