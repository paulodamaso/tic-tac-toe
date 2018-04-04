package oddsandevens.mock;

import game.action.ActionInMatch;
import game.match.Match;
import game.player.PlayerInMatch;
import mock.MockMatch;

/**
 * <p> Mock {@link PlayerInMatch} for testing purposes.
 * 
 * @author paulodamaso
 *
 */
public class MockPlayerInMatch implements OddsAndEvensPlayerInMatch {

	@Override
	public String name() {
		return "Mock Player";
	}

	@Override
	public Match match() {
		return new MockMatch();
	}

	@Override
	public ActionInMatch act() {
		// TODO Auto-generated method stub
		return null;
	}

}
