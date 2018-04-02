package oddsandevens.player;

import game.move.generator.MoveGenerator;
import game.player.GamePlayer;
import oddsandevens.move.generator.OddsAndEvensMoveGenerator;

/**
 * <p> Player with a {@link MoveGenerator} for odds and evens.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensGamePlayer implements GamePlayer<OddsAndEvensPlayerInMatch> {
	
	private final String name;
	private final OddsAndEvensMoveGenerator generator;
	
	public OddsAndEvensGamePlayer(String name, OddsAndEvensMoveGenerator generator) {
		this.name = name;
		this.generator = generator;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public OddsAndEvensMoveGenerator generator() {
		return this.generator;
	}

//	@Override
//	public MoveGenerator<Player> generator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
