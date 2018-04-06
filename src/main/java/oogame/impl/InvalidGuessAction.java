package oogame.impl;

import oogame.InvalidAction;

public final class InvalidGuessAction implements GuessAction, InvalidAction {

	private final GuessAction origin;

	public InvalidGuessAction(GuessAction origin) {
		this.origin = origin;
	}

	@Override
	public InvalidGuessAction evaluate() {
		return this;
	}



}
