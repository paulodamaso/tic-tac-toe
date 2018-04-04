package oddsandevens.action;
/**
 * <P> Tests for {@link OddsAndEvensActionInMatch}.
 * 
 * @author paulodamaso
 *
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.mock.OddsAndEvensMockGamePlayer;
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
}
