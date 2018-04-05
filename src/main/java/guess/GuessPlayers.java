package guess;

import java.util.ArrayList;
import java.util.Scanner;

import game.player.Player;
import game.player.Players;

public final class GuessPlayers implements Players {

	private final ArrayList<GuessPlayer> players;
	private final GuessMatch match;

	public GuessPlayers(GuessMatch match) {
		this.players = new ArrayList<>();
		this.match = match;
	}

	public GuessPlayers(GuessMatch match, Player player) {
		this(match);
		add(player);
	}

	@Override
	public GuessPlayer add(Player player) {
		GuessPlayer newPlaya = new GuessPlayer(player, this.match);
		players.add(newPlaya);
		return newPlaya;
	}

	public GuessPlayer next() {
		return players.get(0);
	}

	public GuessPlayer previous() {
		return players.get(0);
	}

}
