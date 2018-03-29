package mock;

import game.player.MatchPlayers;
import game.result.Partial;

/**
 * <p> Mock for partial result. Used for testing  {@link Partial} interface
 * and testing when a {@link Partial} is needed.
 *  
 * @author paulodamaso
 *
 */
public class MockPartialResult implements Partial {

	public MockPartialResult() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MatchPlayers winners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatchPlayers losers() {
		// TODO Auto-generated method stub
		return null;
	}

}
