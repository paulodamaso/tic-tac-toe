package oddsandevens;

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
				new OddsAndEvensComputerPlayer("Player one", true, match),
				new OddsAndEvensComputerPlayer("Player two", true, match));
		OddsAndEvensPartialResult oepr = new OddsAndEvensPartialResult(match);
		
		
	}

}
