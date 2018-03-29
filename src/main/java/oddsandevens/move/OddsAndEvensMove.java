package oddsandevens.move;

import game.move.Move;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.BaseOddsAndEvensPlayer;

/**
 * <p> Interface for {@link Move} of a odds and evens game.
 * 
 * <p> Narrow the return type of  {@link #player()} and {@link #perform()} to
 * comply with specific odds and evens game and match needs.
 * 
 * <p> Defines a {@link #number()} method which returns the value the player has chosen for this move. 
 * 
 * @author paulodamaso
 *
 */
public interface OddsAndEvensMove extends Move {
	
	@Override
	public BaseOddsAndEvensPlayer player();
	
	@Override
	public OddsAndEvensMatch perform();

	public abstract Integer number() ;
	
}
