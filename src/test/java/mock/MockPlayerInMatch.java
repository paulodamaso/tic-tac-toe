package mock;

import game.action.UnevaluatedMove;
import game.match.Match;
import game.player.PlayerInMatch;

/**
 * <p> Mock {@link PlayerInMatch} for testing purposes.
 * 
 * @author paulodamaso
 *
 */
public class MockPlayerInMatch implements PlayerInMatch {

	@Override
	public String name() {
		return "Mock Player";
	}

	@Override
	public Match match() {
		return new MockMatch();
	}

	@Override
	public UnevaluatedMove act() {
		// TODO Auto-generated method stub
		return null;
	}

}
