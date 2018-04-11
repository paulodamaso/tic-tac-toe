package oogame.impl;


import oogame.Result;

/**
 * <p> A result implemented for a guess game.
 * 
 * <p> Results for a guess game have a line saying if the player won the game, the number chosen by 
 * the computer and the player's guess.
 *  
 * @author paulodamaso
 *
 */
public final class GuessResult implements Result {

	private final String result;
	private final Integer chosen;
	private final Integer guess;

	public GuessResult(String result, Integer chosen, Integer guess) {
		this.result = result;
		this.chosen = chosen;
		this.guess = guess;
	}

	public String result() {
		return " \nGuess game result: \n" +
				this.result + "\n" +
				"Number Chosen by match: " + this.chosen.intValue() + "\n"+
				"Number Chosen by player" + this.guess.intValue() ;
	}
	
}
