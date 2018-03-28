package game.player;

import game.match.Match;
import game.move.Move;
import game.move.NullMove;

/**
 * <p> A representation of a null player, a player with null content.
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
	public Move move() {
		//this player does not make moves, returns a null move 
		return new NullMove(this.match, this);
	}
}
