package oogame.impl;

import oogame.Action;

/**
 * <p> {@link Action} implementation for a guess game. Just declares overriding methods, narrowing
 * return types to guess game related types.
 *  
 * @author paulodamaso
 *
 */
public interface GuessAction extends Action {

	@Override
	public abstract GuessAction evaluate();
	
	public abstract String value();
}
