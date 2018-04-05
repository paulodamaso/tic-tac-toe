package newGame.guess;

import newGame.action.Action;

public interface GuessAction extends Action {

	public abstract GuessAction evaluate();
	public abstract GuessMatch perform();
	public abstract GuessPlayer player();
	public abstract GuessMatch match();
	public abstract Integer guess();
	
	
}
