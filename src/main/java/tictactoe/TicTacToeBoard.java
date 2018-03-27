package tictactoe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import game.board.Board;
import game.board.tile.EmptyTile;
import game.board.tile.Tile;
import game.board.tile.TileContent;
import game.position.BiDimensionalPosition;
import game.position.Position;
import game.result.DrawResult;
import game.result.Result;
import game.result.WinResult;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tiles == null) ? 0 : tiles.hashCode());
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
		TicTacToeBoard other = (TicTacToeBoard) obj;

		if (tiles == null) {
			if (other.tiles != null)
				return false;
		} else if (!tiles.equals(other.tiles)
				) 
			return false;
		
		return true;
	}

	public TicTacToeBoard(Map<Position, TicTacToeTile> tiles) {
		this.tiles = tiles;
	}

	@Override
	public TicTacToeTile tile(Position position) {
		return tiles.get(position) != null ? tiles.get(position) : new TicTacToeInvalidTile();
	}

	public Collection<TicTacToeTile> tiles() {
		return tiles.values();
	}

	@Override
	public TicTacToeBoard add(Position position, TileContent tileContent) throws Exception{
		tiles.put(position, tile(position).put(tileContent));
		return new TicTacToeBoard(tiles);
	}

	@Override
	public Result check() throws Exception {
		//the board must check ending conditions for a tic tac toe game
		//the ending conditions are:
		// the player which had completed a line wins 
		// the player which had completed a column wins
		// the player which had completed a diagonal wins
		// if none the above, and the board is full, it's a draw and no one wins
		// if none the above the game has not finished yet
	
		try {
				int dimension = new Double(Math.sqrt(new Integer(tiles().size()).doubleValue())).intValue();
				
				//line check
				for(int i = 0; i< dimension; i++) {
					boolean line = true;
					int j = 0;
					TileContent winner = this.tile(new BiDimensionalPosition(i, j)).content();
					while(line && j < dimension) {
						line = line && winner.equals(this.tile(new BiDimensionalPosition(i, j)).content());
						j++;
					}
					//we have a winner in line i, return tile content?
					if (line) return new WinResult(new TicTacToePlayers(winner), new TicTacToePlayers(winner));
				}
				
				//column check
				for(int i = 0; i< dimension; i++) {
					boolean line = true;
					int j = 0;
					TicTacToeTileContentImpl winner = this.tile(new BiDimensionalPosition(j, i)).content();
					while(line && j < dimension) {
						line = line && winner.equals(this.tile(new BiDimensionalPosition(j, i)).content());
						j++;
					}
					//we have a winner in column i, return tile content?
					if (line) return new WinResult(new TicTacToePlayers(winner), new TicTacToePlayers(winner));
				}
				
				//left diagonal check
				for(int i = 0; i< dimension; i++) {
					boolean line = true;
					int j = 0;
					TicTacToeTileContentImpl winner = this.tile(new BiDimensionalPosition(i, i)).content();
					while(line && j < dimension) {
						if (i == j)
							line = line && winner.equals(this.tile(new BiDimensionalPosition(j, i)).content());
						j++;
					}
					//we have a winner in left diagonal, return tile content?
					if (line) return new WinResult(new TicTacToePlayers(winner), new TicTacToePlayers(winner));
				}
				
				//right diagonal check
				for(int i = dimension-1; i>= 0; i--) {
					boolean line = true;
					int j = dimension-1;
					TicTacToeTileContentImpl winner = this.tile(new BiDimensionalPosition(i, i)).content();
					while(line && j >= 0) {
						if (i == j)
							line = line && winner.equals(this.tile(new BiDimensionalPosition(j, i)).content());
						j--;
					}
					//we have a winner in right diagonal, return tile content?
					if (line) return new WinResult(new TicTacToePlayers(winner), new TicTacToePlayers(winner));
				}
				
				//draw check; just see if the board are full; if the board is full and it came to here means that 
				//it's a draw
				if (!tiles.containsValue(new TicTacToeEmptyTile())) return new DrawResult();

				//the game must go on, what i must return? a game result (null result, match not ended, etc), a match status? 
//				return new SimpleResult(new ArrayList<>(), new ArrayList<>());
				
		}catch (Exception e) {
			// TODO: handle exception
			//something bad happened
//			return new SimpleResult(new ArrayList<>(), new ArrayList<>());
		}
		return null;
	}

}
