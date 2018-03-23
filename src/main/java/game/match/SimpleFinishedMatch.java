package game.match;

import java.util.Collection;

import game.Player;
import game.result.Result;
import game.result.SimpleResult;

/**
 * <p> A simple finished match.
 * 
 * @author paulodamaso
 *
 */
public final class SimpleFinishedMatch implements FinishedMatch {

	private final Match match;
	private final Collection<Player> winners;
	private final Collection<Player> losers;
	
	public SimpleFinishedMatch(Match match, Collection<Player> winners, Collection<Player> losers) {
		this.match = match;
		this.winners = winners;
		this.losers = losers;
	}

	@Override
	public Collection<Player> players() {
		return this.match.players();
	}

	@Override
	public Match check() {
		return match.check();
	}

	@Override
	public Result result() {
		return new SimpleResult(this.winners, this.losers);
	}

}
