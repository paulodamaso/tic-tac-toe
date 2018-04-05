package guess;

import java.util.ArrayList;
import java.util.Collection;

import game.match.Match;
import game.player.Player;

public final class GuessMatch implements Match {

	private final GuessPlayers players;
	private final Integer number;
	private final Collection<GuessActionImpl> actions;

	public GuessMatch(Player player) {
		this.players = new GuessPlayers(this, player);
		this.number = new Integer(new Double(Math.random() * 10).intValue());
		this.actions = new ArrayList<>(1);
	}

	public GuessMatch(Integer number) {
		this.players = new GuessPlayers(this);
		this.number = number;
		this.actions = new ArrayList<>(1);
	}

	public GuessMatch(GuessMatch match, GuessActionImpl action) {
		this.players = match.players;
		this.number = match.number;
		this.actions = new ArrayList<>(1);
		this.actions.add(action);
	}

	@Override
	public GuessResult result() {

		if (actions.isEmpty()) {
			// player not played yet
			// game is not over
			return new GuessResult("The match has not ended yet", this);
		} else {
			if (actions.iterator().next().guess().equals(number))
				return new GuessResult("Wow, you've guessed the number! :D", this);

			return new GuessResult("Oh no, you're wrong :/", this);
		}
	}

	@Override
	public GuessResult play() {
		System.out.println("Guess my number: ");
		return players.next().act().evaluate().perform().result();
	}

	public Integer number() {
		return this.number;
	}

}
