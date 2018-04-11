package oogame.impl;

import oogame.InvalidAction;
import oogame.Match;
import oogame.Player;

public final class InvalidGuessAction implements GuessAction, InvalidAction {

	private final GuessAction origin;

	public InvalidGuessAction(GuessAction origin) {
		this.origin = origin;
	}

	@Override
	public InvalidGuessAction evaluate() {
		return this;
	}

	@Override
	public Player player() {
		return origin.player();
	}

	@Override
	public Match match() {
		return origin.match();
	}

	@Override
	public String value() {
		return origin.value();
	}
}
