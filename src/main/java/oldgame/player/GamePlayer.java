package oldgame.player;

import oldgame.action.Action;

public interface GamePlayer extends Player {

	/**
	 * <p> An action made by the player.
	 * 
	 * 
	 * @return
	 */
	public abstract Action act();
	
}
