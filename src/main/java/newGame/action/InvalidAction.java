package newGame.action;

import newGame.match.Match;

public final class InvalidAction implements Action {
	
	private final Action origin;

	public InvalidAction(Action origin) {
		this.origin = origin;
	}

	@Override
	public Action evaluate() {
		// TODO Auto-generated method stub
		//heck no
		return null;
	}

	@Override
	public Match perform() {
		// TODO Auto-generated method stub
		// no too!
		return null;
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
		InvalidAction other = (InvalidAction) obj;
		if (!origin.equals(other.origin)) return false;
		return true;
	}

}
