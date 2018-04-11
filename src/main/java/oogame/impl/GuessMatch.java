package oogame.impl;

import java.util.ArrayList;
import java.util.Collection;

import oogame.Match;
import oogame.Player;


public final class GuessMatch implements Match {

	private final GuessPlayers players;
	private final Integer number;
	private final Collection<GuessAction> actions;

	public GuessMatch(Player player) {
		this.players = new GuessPlayers(this, player);
		this.number = new Integer(new Double(Math.random() * 10).intValue());
		this.actions = new ArrayList<>(1);
	}

	public GuessMatch(GuessMatch match, GuessAction action) {
		this.players = match.players;
		this.number = match.number;
		this.actions = new ArrayList<>(1);
		this.actions.add(action);
	}

	@Override
	public GuessResult result() {

		/*
		 * @todo #11 avoid fluent interfaces in guessmatch.result()
		 */
		/*
		 * @todo #9 who should define the winner? the match or the result?
		 */
		Integer guess = this.actions.iterator().next().value();
		return 
				( guess.intValue() == this.number.intValue()) ? 
					new GuessResult("Wow, you've guessed the number! :D", this.number, guess) :
					new GuessResult("Oh no, you're wrong :/", this.number, guess)
					;
	}

	@Override
	public GuessResult play() {

		/*
		 * @todo #11 avoid fluent interfacing in match.play()
		 */
		System.out.println("Guess my number: ");
		return 

				new GuessMatch(
						this, 
							new EvaluatedAction(
								new GuessPlayer(
										players.next(),
										this
										).act().evaluate()
								).perform()
							).result();
	}
}
