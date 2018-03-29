package game.result;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mock.MockPartialResult;

/**
 * <p> Tests for the {@link Partial} interface.
 *  
 * @author paulodamaso
 *
 */
public class PartialTest{ 

	/**
	 * <p> Test of {@link Partial#partial()} method.
	 */
	@Test
	public void testPartial() {
		Partial result = new MockPartialResult();
		assertTrue(result.partial());
	} 

}
