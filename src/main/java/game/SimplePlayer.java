package game;

import game.move.Move;

/**
 * <p> Simple player.
 * @author paulodamaso
 *
 */
public class SimplePlayer implements Player {

	private final String name; 
	
	public SimplePlayer(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		SimplePlayer other = (SimplePlayer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Move move(Move move) {
		// TODO Auto-generated method stub
		return null;
	}

}
