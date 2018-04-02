package oddsandevens.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import game.player.MatchPlayers;
import game.player.Player;
import oddsandevens.match.OddsAndEvensMatch;

/**
 * <p> Odds and even {@link Player} set.
 * 
 * @author paulodamaso
 *
 */
/*
 *  @todo #7 make this class immutable
 */
public final class OddsAndEvensPlayers implements MatchPlayers {
	
	private final List<OddsAndEvensPlayerInMatch> players;
	private ListIterator<OddsAndEvensPlayerInMatch> iterator;

	public OddsAndEvensPlayers(OddsAndEvensMatch match, OddsAndEvensGamePlayer...player) {
		this.players = new ArrayList<OddsAndEvensPlayerInMatch>();
		for(OddsAndEvensGamePlayer p : player){
			players.add(new OddsAndEvensPlayerInMatch(p, match));
		}
		this.iterator = this.players.listIterator();
	}
	
	public OddsAndEvensPlayers(OddsAndEvensPlayerInMatch...players) {
		this.players = Arrays.asList(players);
		this.iterator = this.players.listIterator();
	}

	public OddsAndEvensPlayerInMatch next() {
		if (this.iterator.hasNext())
			return this.iterator.next();
		else
			return (this.iterator = players.listIterator()).next();
	}

	@Override
	public OddsAndEvensPlayerInMatch previous() {
		if (this.iterator.hasPrevious())
			return this.iterator.previous();
		else
			return (this.iterator = players.listIterator()).previous();
	}
	
	public OddsAndEvensPlayerInMatch odds() {return this.players.get(0);}
	
	public OddsAndEvensPlayerInMatch evens() {return this.players.get(this.players.size()-1);}
}
