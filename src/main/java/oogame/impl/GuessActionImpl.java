package oogame.impl;

/**
 * <p> {@link GuessAction} implementation.
 * 
 * @author paulodamaso
 *
 */
public final class GuessActionImpl implements GuessAction {

	private final GuessMatch match;
	private final GuessPlayer player;

	public GuessActionImpl(GuessMatch guessMatch, GuessPlayer player) {
		this.match = guessMatch;
		this.player = player;
	}


	@Override
	public GuessAction evaluate() {
		try {
			Integer.parseInt(player.act());
		} catch (Exception e) {
			return new InvalidGuessAction(this);
		}

		return this;
	}

	@Override
	public GuessMatch perform() {
		return new GuessMatch(this.match, this);
	}

	@Override
	public GuessPlayer player() {
		return this.player;
	}

	@Override
	public GuessMatch match() {
		return this.match;
	}

}
