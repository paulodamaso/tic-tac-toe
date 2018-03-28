package oddsandevens.move;

import game.move.Move;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensPlayer;

public interface OddsAndEvensMove extends Move {
	
	public OddsAndEvensMatch match();
	
	public OddsAndEvensPlayer player();

	public abstract Integer number() ;
	
	public OddsAndEvensMatch perform();
	
}
