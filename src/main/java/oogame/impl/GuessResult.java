package oogame.impl;


import oogame.Result;

public final class GuessResult implements Result {

	private final String result;
	private final GuessMatch match;

	public GuessResult(String result, GuessMatch match) {
		this.result = result;
		this.match = match;
	}

	public String result() {
		return result + " \nThe chosen number was: " + match.number();
	}
	
}
