package game.action;

import game.match.Match;

/**
 * <p> Represents the action tied to a match
 * 
 * @author paulodamaso
 *
 */
public interface ActionInMatch extends Action {

	/**
	 * <p> Perform the action to a match an return the new {@link Match} with the action results.
	 *  
	 * @return {@link Match} representing the match state after the action.
	 */
	public abstract Match perform() ;
	
	/**
	 * <p> Evaluate the action according to match rules and status, returning a new action with the result of the evaluation. If the action
	 * is not valid, return an {@link InvalidAction}.
	 * 
	 * @return the evaluated action, or an {@link InvalidAction} if this action is invalid
	 */
	@Override
	public abstract ActionInMatch evaluate();
}
