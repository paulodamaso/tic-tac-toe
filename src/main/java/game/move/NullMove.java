package game.move;


import game.match.Match;
import game.player.PlayerInMatch;

/**
 * <p> A null move; a move that does not changes the match state.
 */
public final class NullMove implements Move {

	private final Match match;
	private final PlayerInMatch player;	
	
	public NullMove(Match match, PlayerInMatch player) {
		this.match = match;
		this.player = player;
	}

	@Override
	public PlayerInMatch player() {
		return this.player;
	}

	/**
	 * <p> Returns the same match because a null move does not changes the match state.
	 */
	@Override
	public Match perform() {
		return this.match;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((match == null) ? 0 : match.hashCode());
		result = prime * result + ((player == null) ? 0 : player.hashCode());
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
		NullMove other = (NullMove) obj;
		if (match == null) {
			if (other.match != null)
				return false;
		} else if (!match.equals(other.match))
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		return true;
	}	
}
