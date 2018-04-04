package oddsandevens.action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * <p> Tests for {@link OddsAndEvensInvalidAction} class.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensInvalidActionTest {

	@Test
	public void testNumber() {
		//must return the number sent in constructor; iterate 100.000 times
		for(int i = 0; i< 100000; i++) {
			Integer integer = new Integer(new Double(Math.random()).intValue());
			OddsAndEvensInvalidAction action = new OddsAndEvensInvalidAction(new OddsAndEvensActionImpl(integer));
			assertEquals(integer, action.number());
		}
	}
	
	@Test
	public void hashCodeTest() {
		OddsAndEvensInvalidAction action = new OddsAndEvensInvalidAction(null);
		assertEquals(31, action.hashCode());
		
		action = new OddsAndEvensInvalidAction(new OddsAndEvensActionImpl(0) );
		assertEquals(970866005, action.hashCode());		
		
	}
}
