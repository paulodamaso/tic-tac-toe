package oogame.impl;

import java.util.Scanner;

import oogame.Action;
import oogame.MatchPlayer;
import oogame.Player;

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

	public String act() {
		return new Scanner(System.in).nextLine();
				
	}

	public Player origin() {
		return this.origin;
	}

	@Override
	public GuessMatch match() {
		return this.match;
	}
}
