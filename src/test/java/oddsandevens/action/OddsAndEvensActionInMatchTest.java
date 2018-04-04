package oddsandevens.action;
/**
 * <P> Tests for {@link OddsAndEvensActionInMatch}.
 * 
 * @author paulodamaso
 *
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.action.InvalidAction;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.mock.OddsAndEvensMockGamePlayer;
import oddsandevens.player.OddsAndEvensGamePlayer;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

public class OddsAndEvensActionInMatchTest {

	@Test
	public void testNumber() {
		//must return the number sent in constructor; iterate 100.000 times
		for(int i = 0; i< 100000; i++) {
			Integer integer = new Integer(new Double(Math.random()).intValue());
			OddsAndEvensActionInMatch action = new OddsAndEvensActionInMatch(
					new OddsAndEvensActionImpl(integer), 
					new OddsAndEvensPlayerInMatch(
							new OddsAndEvensMockGamePlayer(0), 
							new OddsAndEvensMatch(
									new OddsAndEvensMockGamePlayer(0), 
									new OddsAndEvensMockGamePlayer(1))));
			assertEquals(integer, action.number());
		}
	}

	/**
	 * @see OddsAndEvensActionInMatch#evaluate()
	 */
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
	
	@Test
	public void testEvaluate() {
		OddsAndEvensGamePlayer player = new OddsAndEvensMockGamePlayer(0);
		OddsAndEvensMatch match = new OddsAndEvensMatch(
				player, 
				new OddsAndEvensMockGamePlayer(1)); 
		OddsAndEvensPlayerInMatch pm = new OddsAndEvensPlayerInMatch(player, match);

		//number smaller than 0
		OddsAndEvensActionInMatch action = new OddsAndEvensActionInMatch(
				new OddsAndEvensActionImpl(-1), 
				new OddsAndEvensPlayerInMatch(player, match));
		assertEquals(new OddsAndEvensActionInMatch(new OddsAndEvensInvalidAction(action), pm), action.evaluate());
		
	}
}
