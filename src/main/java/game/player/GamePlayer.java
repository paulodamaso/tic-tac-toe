package game.player;

import game.action.Action;

public interface GamePlayer extends Player {

	/**
	 * <p> An action made by the player.
	 * 
	 * 
	 * @return
	 */
	public abstract Action act();
	
}
