package game;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * <p> Simple implementation of a {@link Player} collection.
 * 
 * @author paulodamaso
 *
 */
/*
 * @todo #7 refactor this class using an immutable iterator or circular list    
 */
public final class SimplePlayers implements Players {
	
	private final Collection<Player> players;
	private Iterator<Player> itPlayers;


	public SimplePlayers(Player...players) {
		this.players = Arrays.asList(players);
		this.itPlayers = this.players.iterator();
	}

	@Override
	public Player next() {
		
		if(!itPlayers.hasNext()) {
			this.itPlayers = this.players.iterator();
		}
		return itPlayers.next();
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimplePlayers other = (SimplePlayers) obj;
		return this.players.equals(other.players);
	}
	
	public Collection<Player> players() {
		return this.players;
	}


}
