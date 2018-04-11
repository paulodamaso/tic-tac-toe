package oogame;



/**
 * <p>
 * An action of a {@link Player} in a {@link Match}.
 * 
 * <p> The {@link #evaluate()} method evaluates the action to guarantee that it conforms to the 
 * rules of the game this match represents. If the action is accounted as invalid, for disobeying 
 * some game rule for example, the {@link #evaluate()} method must return an {@link InvalidAction} 
 * and {@link Action} implementation representing this fact.
 * 
 * <p> Every action is related to a {@link Match}, which is the match where the action belongs. It 
 * means that some particular action is made to a {@link Match}, where its state will be applied, 
 * altering that {@link Match} state to a new one. The {@link #perform()} method is the assimilation
 *  of this action by the match that it belongs; by performing, an action applies itself
 * to a {@link Match}, generating a {@link Match} with this new state.
 * 
 * <p>
 * The {@link #perform()} method of an action must return the {@link Match} returned in  
 * {@link #match()} with the action added to it, changing its state. For compliance with 
 * immutability standards the {@link Match} returned must be a new instance of {@link Match}
 * instead just the same instance with changed data.
 * 
 * @author paulodamaso
 *
 */
public interface Action {

	/**
	 * <p> Evaluate the action according to game rules, returning a new action with the	result 
	 * of the evaluation. If the action is not valid, return something that implements both 
	 * {@link InvalidAction} and {@link Action}.
	 * 
	 * @return the evaluated action, or an {@link InvalidAction} if this action is
	 *         invalid.
	 */
	public abstract Action evaluate();

	/**
	 * <p>
	 * The player which made this action.
	 * 
	 * @return {@link Player} which made this action.
	 */
	public abstract Player player();

	/**
	 * <p>
	 * The {@link Match} which this actions belongs to.
	 * 
	 * @return {@link Match} instance.
	 */
	public abstract Match match();

	@Override
	public abstract boolean equals(Object obj);

	@Override
	public int hashCode();
}
