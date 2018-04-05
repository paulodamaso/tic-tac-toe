package newGame.action;

import newGame.match.Match;
import newGame.player.Player;

public interface Action {

	public abstract Action evaluate();
	public abstract Match perform();
	public abstract Player player();
	public abstract Match match();
	
	@Override
	public abstract boolean equals(Object obj);
	
	@Override
	public int hashCode() ;
}
