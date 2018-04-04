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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OddsAndEvensInvalidAction other = (OddsAndEvensInvalidAction) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

}
