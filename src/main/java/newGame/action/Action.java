package newGame.action;

import newGame.match.Match;

public interface Action {

	public abstract Action evaluate();
	public abstract Match perform();
	
	@Override
	public abstract boolean equals(Object obj);
	
	@Override
	public int hashCode() ;
}
