package oogame.impl;

import oogame.ValidAction;

public interface GuessValidAction extends ValidAction {

	/**
	 * <p>
	 * Perform the action to a match an return the new {@link Match} with the action
	 * results.
	 * 
	 * @return {@link Match} representing the match state after the action.
	 */
	@Override
	public abstract GuessMatch perform();
}
