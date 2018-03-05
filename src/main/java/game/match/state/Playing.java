package game.match.state;

import game.match.Match;

/**
 * <p> A playing state represents that the match is being played, e.g., it has not yet finished.
 * 
 * @author paulodamaso
 *
 */
public final class Playing implements MatchState {

	public Playing() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Match start(Match match) {
		// TODO Auto-generated method stub
		//invalid call here
		return null;
	}

	@Override
	public Match draw(Match mathc) {
		// TODO Auto-generated method stub
		//ends the match in a draw
		return null;
	}

	@Override
	public Match end(Match match) {
		// TODO Auto-generated method stub
		//ends the match in a victory / loss condition
		return null;
	}

	@Override
	public Match play(Match match) {
		// TODO Auto-generated method stub
		//make a move
		return null;
	}

}
