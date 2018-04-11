package oogame;

import oogame.impl.GuessAction;

public interface ValidAction extends GuessAction {

	/**
	 * <p>
	 * Perform the action to a match an return the new {@link Match} with the action
	 * results.
	 * 
	 * @return {@link Match} representing the match state after the action.
	 */
	public abstract Match perform();
}
