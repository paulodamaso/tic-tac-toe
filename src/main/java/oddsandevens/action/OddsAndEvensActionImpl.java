package oddsandevens.action;

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
