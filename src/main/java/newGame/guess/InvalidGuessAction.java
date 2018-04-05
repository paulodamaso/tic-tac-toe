package newGame.guess;

public final class InvalidGuessAction implements GuessAction {
	
	private final GuessAction origin;

	public InvalidGuessAction(GuessAction origin) {
		this.origin = origin;
	}

	@Override
	public GuessAction evaluate() {
		return this;
	}

	@Override
	public GuessMatch perform() {
		return origin.match();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result +  origin.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		InvalidGuessAction other = (InvalidGuessAction) obj;
		if (!origin.equals(other.origin)) return false;
		return true;
	}

	@Override
	public GuessPlayer player() {
		return origin.player();
	}

	@Override
	public Integer guess() {
		// this action is invalid, so, we need another action
		return null;
	}

	@Override
	public GuessMatch match() {
		return origin.match();
	}

}
