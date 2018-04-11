package oogame.impl;

/**
 * <p> {@link GuessAction} implementation.
 * 
 * @author paulodamaso
 *
 */
public final class SimpleGuessAction implements GuessAction {

	private final GuessMatch match;
	private final GuessPlayer player;
	private final String value;

	public SimpleGuessAction(GuessPlayer player, String value) {
		this.match = player.match();
		this.player = player;
		this.value = value;
	}
	
	public SimpleGuessAction(GuessPlayer player) {
		/*
		 * @todo #15 SimpleGuessAction ctor should not use null.
		 */
		this(player, null);
	}


	@Override
	public GuessAction evaluate() {
		try {
			Integer.parseInt(value);
		} catch (Exception e) {
			return new InvalidGuessAction(this);
		}

		return this;
	}

	@Override
	public GuessPlayer player() {
		return this.player;
	}

	@Override
	public GuessMatch match() {
		return this.match;
	}


	@Override
	public String value() {
		return this.value;
	}

}
