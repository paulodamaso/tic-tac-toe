package oddsandevens.action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * <p> Test for {@link OddsAndEvensAction}.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensActionImplTest {

	public OddsAndEvensActionImplTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testNumber() {
		//must return the number sent in constructor; iterate 100.000 times
		for(int i = 0; i< 100000; i++) {
			Integer integer = new Integer(new Double(Math.random()).intValue());
			OddsAndEvensAction action = new OddsAndEvensActionImpl(integer);
			assertEquals(integer, action.number());
		}
	}
	

}
