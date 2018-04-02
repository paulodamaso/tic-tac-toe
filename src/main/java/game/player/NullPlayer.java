package game.player;

import game.match.Match;
import game.move.NullMove;
import game.move.UnevaluatedMove;

/**
 * <p> A representation of a null player, a player with null content, in a match.
 * 
 * <p> Null players return a {@link NullMove} when they try to create a move in a match. 
 * 
 * @author paulodamaso
 *
 */
public final class NullPlayer implements PlayerInMatch {
	
	private final Match match;

	public NullPlayer(Match match) {
		this.match = match;
	}

	@Override
	public String name() {
		return null;
	}

	@Override
	public Match match() {
		return this.match;
	}

	@Override
	public UnevaluatedMove move() {
		//this player does not make moves, returns a null move 
		return new NullMove(this.match, this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((match == null) ? 0 : match.hashCode());
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
		NullPlayer other = (NullPlayer) obj;
		if (match == null) {
			if (other.match != null)
				return false;
		} else if (!match.equals(other.match))
			return false;
		return true;
	}


}
