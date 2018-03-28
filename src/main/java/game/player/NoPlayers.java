package game.player;

import game.match.Match;

/**
 * <p> A empty {@link MatchPlayers} object, assigned to a match. It returns a {@link NullPlayer} in each
 * methods which return {@link PlayerInMatch} references, indicating that this is not
 * a valid player.  
 * 
 * @author paulodamaso
 *
 */
public final class NoPlayers implements MatchPlayers {
	
	private final Match match;

	public NoPlayers(Match match) {
		this.match = match;
	}

	@Override
	public PlayerInMatch next() {
		return new NullPlayer(this.match);
	}

	@Override
	public PlayerInMatch previous() {
		return new NullPlayer(this.match);
	}

	@Override
	public Match match() {
		return this.match;
	}

}
