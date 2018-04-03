package game.action;

import game.match.Match;

/**
 * <p> Decorator for defining an action as invalid. 
 * 
 * <p> Invalid actions are action which are prohibited by game rule moves. They are created by {@link Action#evaluate(Action)} method, 
 * decorating the original action. They do not perform, returning the same {@link Match} associated with its origin {@link Action}.
 * 
 * <p> This class must be  instantiated for each game type, allowing game specific invalid actions. 
 * 
 * @author paulodamaso
 *
 */
public interface InvalidAction extends Action {
	
}
