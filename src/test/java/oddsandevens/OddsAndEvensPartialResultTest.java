package oddsandevens;

import mock.MockMatch;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensComputerPlayer;
import oddsandevens.result.OddsAndEvensPartialResult;

/**
 * <p> Tests for {@link OddsAndEvensPartialResult}.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensPartialResultTest {

	public OddsAndEvensPartialResultTest() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p> Test of the winners method.
	 * 
	 */
	public void winnersTest() {
		//an OddsAndEvensPartialResultTest must return NoPlayers as winners because it does not
		//have partial state;
		OddsAndEvensMatch match = new OddsAndEvensMatch(
				new OddsAndEvensComputerPlayer("Player one", true, new MockMatch()),
				new OddsAndEvensComputerPlayer("Player two", true, new MockMatch));
		OddsAndEvensPartialResult oepr = new OddsAndEvensPartialResult(match);
		
		
	}

}
