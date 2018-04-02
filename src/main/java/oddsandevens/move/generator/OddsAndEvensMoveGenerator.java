package oddsandevens.move.generator;

import game.move.generator.MoveGenerator;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

/**
 * <p> Move generator for {@link OddsAndEvensMatch}
 * 
 * @author paulodamaso
 *
 */
public interface OddsAndEvensMoveGenerator extends MoveGenerator<OddsAndEvensPlayerInMatch> {

	@Override
	public OddsAndEvensMove create(OddsAndEvensPlayerInMatch player) ;

}
