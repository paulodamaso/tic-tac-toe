package oddsandevens.player;

import oddsandevens.action.OddsAndEvensAction;
import oddsandevens.action.OddsAndEvensActionImpl;
import oldgame.player.Player;

/**
 * <p> An odds and evens {@link Player} which generates input from a random number generator.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensRandomNumberPlayer extends OddsAndEvensGamePlayer {

	
	public OddsAndEvensRandomNumberPlayer(String name) {
		super(name);
	}

	@Override
	public OddsAndEvensAction act() {
		return new OddsAndEvensActionImpl(new Integer(new Double(Math.random() * 5).intValue()));
	}

}
