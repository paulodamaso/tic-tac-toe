package oddsandevens.action;

import game.action.Action;
import game.action.InvalidAction;

/**
 * <p> Interface for {@link Action} of an odds and evens game.
 * 
 * <p> An action in an odds and evens game is the selection of an integer, between 0 and 5 (for humans). This rules are tested in the
 * {@link OddsAndEvensAction#evaluate()} method.
 * 
 * @author paulodamaso
 *
 */
public interface OddsAndEvensAction extends Action {

	/**
	 * <p> The number selected by this {@link Action}.
	 *  
	 * @return the value of the number selected by this action 
	 */
	public Integer number() ;


	/**
	 * <p> Evaluates this action.
	 * 
	 *  <p> Evaluation rules for an odds and evens action:
	 *  <ul>
	 *  	<li> this.number must be integer (?) </li>
	 *  	<li> this.number must be greater or equal to zero </li>
	 *  	<li> this.number must be smaller or equal to five (humans just have five fingers)</li>
	 *  </ul>
	 *  <p> If this.number does not respect any of these rules, an {@link InvalidAction} must be returned.
	 */
	@Override
	public default OddsAndEvensAction evaluate() {
		if (number().intValue() >= 0 && number().intValue() <= 5) return this;
		return new OddsAndEvensInvalidAction(this);
	}
}
