package oddsandevens.action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.action.InvalidAction;

/**
 * <p> Test class for {@link OddsAndEvensAction}.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensActionTest {

	/**
	 * <p> {@link OddsAndEvensAction#evaluate()} test.
	 *  <p> Evaluation rules for an odds and evens action:
	 *  <ul>
	 *  	<li> this.number must be integer </li>
	 *  	<li> this.number must be greater or equal to zero </li>
	 *  	<li> this.number must be smaller or equal to five (humans just have five fingers)</li>
	 *  </ul>
	 *  <p> If this.number does not respect any of these rules, an {@link InvalidAction} must be returned.
	 */
	@Test
	public void testEvaluate() {
		OddsAndEvensAction act = new OddsAndEvensActionImpl(new Integer(-1));
		assertEquals(act.evaluate(), new OddsAndEvensInvalidAction(act));
		
		act = new OddsAndEvensActionImpl(new Integer(7));
		assertEquals(act.evaluate(), new OddsAndEvensInvalidAction(act));
		
		act = new OddsAndEvensActionImpl(new Integer(0));
		assertEquals(act.evaluate(), act);
		
		act = new OddsAndEvensActionImpl(new Integer(5));
		assertEquals(act.evaluate(), act);
	}
}
