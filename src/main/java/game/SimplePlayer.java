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
	public String name() {
		return this.name;
	}

	@Override
	public Move move(Move move) {
		// TODO Auto-generated method stub
		return null;
	}

}
