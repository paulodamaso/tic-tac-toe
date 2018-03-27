package tictactoe;

import game.match.Match;
import game.player.Player;
import game.player.Players;
import game.player.SimplePlayers;

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

	public TicTacToeMatch(Player player1, Player player2, int size) {
		this(player1, player2, new TicTacToeBoard(size));
		try {
			this.play();
		}catch (Exception e) {
			
		}
	}
	
	public TicTacToeMatch(Player player1, Player player2, TicTacToeBoard board) {
		this.player1 = player1;
		this.player2 = player2;		
		this.board = board;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((board == null) ? 0 : board.hashCode());
		result = prime * result + ((player1 == null) ? 0 : player1.hashCode());
		result = prime * result + ((player2 == null) ? 0 : player2.hashCode());
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
		TicTacToeMatch other = (TicTacToeMatch) obj;
		if (board == null) {
			if (other.board != null)
				return false;
		} else if (!board.equals(other.board))
			return false;
		if (player1 == null) {
			if (other.player1 != null)
				return false;
		} else if (!player1.equals(other.player1))
			return false;
		if (player2 == null) {
			if (other.player2 != null)
				return false;
		} else if (!player2.equals(other.player2))
			return false;
		return true;
	}

	public TicTacToeBoard board() {
		return this.board;
	}

	@Override
	public Match check() {
		try {		
			// in tic tac toe a match is finished when:
			// board signal that an ending condition has been reached, return new finished match
			this.board.check();
		}catch(Exception e) {

			//
		}
		return null;
	}

	@Override
	public Players players() {
		return new SimplePlayers(new Player[]{this.player1, this.player2}) ;
	}
	
}
