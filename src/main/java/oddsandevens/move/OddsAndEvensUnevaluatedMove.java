package oddsandevens.move;

import game.Game;
import game.move.Move;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.BaseOddsAndEvensPlayer;

/**
 * <p> An {@link Move} before being evaluated by the {@link Game} instance.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensUnevaluatedMove implements OddsAndEvensMove{
	
	private final BaseOddsAndEvensPlayer player;
	private final Integer number;
	
	public OddsAndEvensUnevaluatedMove(BaseOddsAndEvensPlayer player, Integer number) {
		this.player = player;
		this.number = number;
	}

	@Override
	public OddsAndEvensMatch match() {
		return player.match();
	}

	@Override
	public BaseOddsAndEvensPlayer player() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OddsAndEvensMatch perform() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer number() {
		// TODO Auto-generated method stub
		return null;
	}

}
