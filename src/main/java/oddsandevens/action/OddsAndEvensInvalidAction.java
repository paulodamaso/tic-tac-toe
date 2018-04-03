package oddsandevens.action;

import game.action.InvalidAction;

/**
 * <p> 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensInvalidAction implements InvalidAction, OddsAndEvensAction  {

	private final OddsAndEvensAction origin;
	
	public OddsAndEvensInvalidAction(OddsAndEvensAction origin) {
		this.origin = origin;
	}

	@Override
	public Integer number() {
		return origin.number();
	}

}
