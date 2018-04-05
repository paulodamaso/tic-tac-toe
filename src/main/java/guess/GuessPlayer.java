package guess;

import java.util.Scanner;

import game.action.Action;
import game.player.MatchPlayer;
import game.player.Player;

/**
 * <p> A simple implementation of a guess game player. The player {@link Action} is just to provide
 * a integer number.
 * 
 * @author paulodamaso
 *
 */
public final class GuessPlayer implements MatchPlayer {

	private final Player origin;
	private final GuessMatch match;

	public GuessPlayer(Player origin, GuessMatch match) {
		this.origin = origin;
		this.match = match;
	}

	@Override
	public String name() {
		return this.origin.name();
	}

	@Override
	public GuessAction act() {
		return new GuessActionImpl(match, new Scanner(System.in).nextLine(), this);
	}

	public Player origin() {
		return this.origin;
	}

	@Override
	public GuessMatch match() {
		return this.match;
	}
}
