package guess;

import game.result.Result;

public final class GuessResult implements Result {

	private final String result;
	private final GuessMatch match;

	public GuessResult(String result, GuessMatch match) {
		this.result = result;
		this.match = match;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.result.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		GuessResult other = (GuessResult) obj;
		if (!result.equals(other.result))
			return false;
		return true;
	}

	public String result() {
		return result + " \nThe chosen number was: " + match.number();
	}

}
