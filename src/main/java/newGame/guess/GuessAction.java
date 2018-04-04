package newGame.guess;

import newGame.action.Action;

public final class GuessAction implements Action {
	
	private final GuessMatch match;
	private final String guess;

	public GuessAction(GuessMatch guessMatch, String guess) {
		this.match = guessMatch;
		this.guess = guess;
	}
	
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
			//return new InvalidAction(this);
		}

		return this;
	}

	@Override
	public GuessMatch perform() {
		return new GuessMatch(this.match, this);
	}

}
