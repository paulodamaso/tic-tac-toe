package guess;

import game.action.Action;

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

	@Override
	public abstract GuessMatch perform();

	@Override
	public abstract GuessPlayer player();

	@Override
	public abstract GuessMatch match();

	public abstract Integer guess();

}
