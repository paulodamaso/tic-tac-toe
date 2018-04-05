package game.action;

import game.match.Match;

/**
 * <p>
 * An {@link Action} that is not valid. Invalid actions are created in
 * {@link Action#evaluate()} method, and they model an {@link Action} that is
 * not valid according the game rules defined in {@link Match} or any other
 * reason.
 * 
 * <p>
 * Invalid actions are designed to act as wrappers (decorators) over an
 * {@link Action}, preserving the original {@link Action}. Since there is no
 * meaning in applying invalid actions to a {@link Match}, the
 * {@link #perform()} method of this {@link Action} must return the reference
 * for the {@link Match} of the original {@link Action}; in the same way, the
 * {@link #player()} and {@link Match} methods must return its origin values
 * too.
 * 
 * <p>
 * The exception is the {@link #evaluate()} method, which returns the invalid
 * action itself.
 * 
 * 
 * @author paulodamaso
 *
 */
public interface InvalidAction extends Action {

	@Override
	public abstract InvalidAction evaluate();
}
