package mock;

import game.Game;
import game.match.Match;
import game.player.MatchPlayers;
import game.result.Result;

/**
 * <p> Mock match for testing. A really dumb object just for testing purposes, which receive a number just
 * to be different from another object.
 * 
 * @author paulodamaso
 *
 */
public class MockMatch implements Match {

	private final int number;
	
	public MockMatch() {
		this.number = 0;
	}
	
	public MockMatch(int number) {
		this.number = number;
	}

	@Override
	public Result result() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatchPlayers players() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		MockMatch other = (MockMatch) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public Game game() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
