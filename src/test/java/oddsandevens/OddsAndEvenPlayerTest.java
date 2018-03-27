package oddsandevens;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import oddsandevens.player.OddsAndEvensPlayer;

/**
 * <p> {@link OddsAndEvensPlayer} test class.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvenPlayerTest {

	public OddsAndEvenPlayerTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	/**
	 * <p> Test the {@link OddsAndEvensPlayer#name()} method.
	 * 
	 * <p>Test:
	 * <ul>
	 * 	<li> must return the same string used to create the player object</li>
	 * </ul>
	 * 
	 */
	public void testName() {
		String name = "Epaminondas";
		
		//testing with the same reference
		assertEquals(name, new OddsAndEvensPlayer(name, false).name());

		//testing with the same reference
		assertEquals(name, new OddsAndEvensPlayer("Epaminondas", false).name());
		
	}
	
	/**
	 * <p> Test the {@link OddsAndEvensPlayer#even()} method.
	 * 
	 * <p>Test:
	 * <ul>
	 * 	<li> must return the same value used to create the player object</li>
	 * </ul>
	 * 
	 */
	@Test
	public void testEven() {

		//testing with the two possible values
		assertTrue(new OddsAndEvensPlayer("Epaminondas", true).even());
		assertFalse(new OddsAndEvensPlayer("Epaminondas", false).even());
		
	}

}
