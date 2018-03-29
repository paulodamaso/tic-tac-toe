package mock;

import game.player.MatchPlayers;
import game.result.Definitive;
import game.result.Result;

/**
 * <p> Mock for definitive result. Used for testing  {@link Definitive} interface
 * and testing when a {@link Result} is needed.
 *  
 * @author paulodamaso
 *
 */
public class MockDefinitiveResult implements Definitive {

	public MockDefinitiveResult() {
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
