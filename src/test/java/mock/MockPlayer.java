package mock;

import game.player.Player;

/**
 * <p> Lousy mock player for testing purposes.
 * 
 * @author paulodamaso
 *
 */
public final class MockPlayer implements Player {
	
	private final int number;
	
	public MockPlayer() {
		this.number = 0;
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
		MockPlayer other = (MockPlayer) obj;
		if (number != other.number)
			return false;
		return true;
	}

	public MockPlayer(int number) {
		this.number = number;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

}
