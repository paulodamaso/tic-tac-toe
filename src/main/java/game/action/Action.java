package game.action;

import game.player.Player;

/**
 * <p> Class representing an action made by a {@link Player}.
 * 
 * <p> An {@link Action} 
 * 
 * @author paulodamaso
 *
 */
public interface Action {

	/**
	 * <p> Evaluate the action according to game rules, returning a new action with the result of the evaluation. If the action
	 * is not valid, return an {@link InvalidAction}.
	 * 
	 * @return the evaluated action, or an {@link InvalidAction} if this action is invalid
	 */
	public abstract Action evaluate();

}
