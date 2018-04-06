package collection;

import java.util.Arrays;

import game.player.Player;

public final class PlayerIterator<P extends Player> {
	
	private final P[] players;
	private int index;
	
	public PlayerIterator(P[] players) {
		this.players = players;
		this.index = 0;
	}
	
	public PlayerIterator(PlayerIterator<P> origin, int index) {
		this.players = origin.players;
		this.index = index;
	}
	
	public P next() {
		return players[index++];
	}

	public P previous() {
		return players[--index];
	}
	
	public PlayerIterator<P> add(P player) {
		final P[] newArray = Arrays.copyOf(this.players, this.players.length+1);
		newArray[newArray.length-1] = player;
		return new PlayerIterator<>(newArray);
	}
	
}
