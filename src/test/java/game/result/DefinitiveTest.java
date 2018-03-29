package game.result;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import mock.MockDefinitiveResult;

/**
 * <p> Tests for the {@link Definitive} interface.
 *  
 * @author paulodamaso
 *
 */
public class DefinitiveTest {

	public DefinitiveTest() {
	}
	
	/**
	 * <p> Test of {@link Definitive#partial()} method.
	 */
	@Test
	public void testPartial() {
		Definitive result = new MockDefinitiveResult();
		assertFalse(result.partial());
	} 

}
