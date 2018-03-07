package tictactoe;

import java.util.ArrayList;
import java.util.Collection;

import game.Player;
import game.match.Match;

/**
 * <p> Class representing a match of tic-tac-toe.
 * 
 * @author paulodamaso
 *
 */
public final class TicTacToeMatch implements Match {
	
	private final Player player1;
	private final Player player2;
	
	//the current game board
	private final TicTacToeBoard board;

	public TicTacToeMatch(Player circle, Player cross, int size) {
		this(circle, cross, new TicTacToeBoard(size));
	}
	
	public TicTacToeMatch(Player player1, Player player2, TicTacToeBoard board) {
		this.player1 = player1;
		this.player2 = player2;		
		this.board = board;
	}
	
	public TicTacToeBoard board() {
		return this.board;
	}

	@Override
	public Collection<Player> players() {
		ArrayList<Player> players = new ArrayList<>();
		players.add(this.player1);
		players.add(this.player2);
		return players;
	}

	@Override
	public Match check() {
		//check winning conditions in board, return new finished match or normal match 
		return null;
	}
	
}
