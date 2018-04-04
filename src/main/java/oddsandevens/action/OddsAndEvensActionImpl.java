package oddsandevens.action;

/**
 * <p> Simple implementation for an odds and evens action.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensActionImpl implements OddsAndEvensAction {

	private final Integer number;
	
	public OddsAndEvensActionImpl(Integer number) {
		this.number = number;
	}

	@Override
	public Integer number() {
		return this.number;
	}

}
