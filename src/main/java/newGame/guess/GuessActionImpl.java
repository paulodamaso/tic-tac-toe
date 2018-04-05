package newGame.guess;

public final class GuessActionImpl implements GuessAction {
	
	private final GuessMatch match;
	private final String guess;
	private final GuessPlayer player;

	public GuessActionImpl(GuessMatch guessMatch, String guess, GuessPlayer player) {
		this.match = guessMatch;
		this.guess = guess;
		this.player = player;
	}
	
	@Override
	public Integer guess() {
		return Integer.parseInt(guess);
	}
	
	@Override
	public GuessAction evaluate() {
		// guess action rules:
		// must be an integer number
		//if its ok return itself
		try {
			Integer.parseInt(guess);
		} catch(Exception e) {
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
