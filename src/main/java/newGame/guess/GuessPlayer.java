package newGame.guess;

import java.util.Scanner;

import newGame.player.Player;

public final class GuessPlayer implements Player {

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
		return new GuessAction( match, new Scanner(System.in).nextLine());
	}
}
