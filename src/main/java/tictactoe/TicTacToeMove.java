package tictactoe;

import game.action.Action;
import game.match.Match;
import game.player.Player;
import game.position.Position;

/**
 * <p> A tic tac toe move, where a player put his mark in a tile .
 * 
 * @author paulodamaso
 *
 */
public final class TicTacToeMove implements Action {
	
	private final Player player;
	private final Position position;
	private final TicTacToeMatch match;

	public TicTacToeMove(Player player, Position position, TicTacToeMatch match) {
		this.player = player;
		this.position = position;
		this.match = match;
	}

	@Override
	public Player player() {
		return this.player;
	}
	
	public Position position() {
		return this.position;
	}

	@Override
	public Match perform() throws Exception{
		/**
		 * Tic tac toe rules:
		 * - the player cannot put a mark outside the board;
		 * - the player cannot put a mark in an non-empty tile;	 
		 * 
		 *  Movement:
		 *  - puts the mark in the tile 
		 *  
		 *  Check winner (finished match)
		 */
		//put player mark in tile sent
		//return the populated tile or invalid tile
//		Tile tl = board.tile(this.position).put();
//		board.put(new TicTacToeTile(new TicTacToeTileContent(this.player)), this.position);
		
		return 
				new TicTacToeMatch(
						this.match.players().next(), 
						this.match.players().next(), 
						this.match.board().add(this.position, new TicTacToeTileContentImpl(this.player))
					);
	}

}
