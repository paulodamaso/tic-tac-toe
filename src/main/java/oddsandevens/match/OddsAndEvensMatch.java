package oddsandevens.match;

import java.util.HashMap;
import java.util.Map;

import game.match.Match;
import oddsandevens.move.OddsAndEvensValidMove;
import oddsandevens.player.OddsAndEvensGamePlayer;
import oddsandevens.player.OddsAndEvensPlayerInMatch;
import oddsandevens.player.OddsAndEvensPlayers;
import oddsandevens.result.OddsAndEvensPartialResult;
import oddsandevens.result.OddsAndEvensResult;
import oddsandevens.result.OddsAndEvensWinResult;

/**
 * <p> An odds and evens match.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensMatch implements Match {

	private final OddsAndEvensPlayerInMatch odds;
	private final OddsAndEvensPlayerInMatch evens;
	private final OddsAndEvensPlayers players;
	private final Map<OddsAndEvensPlayerInMatch, Integer> numbers;

	//starting new match
	public OddsAndEvensMatch(OddsAndEvensGamePlayer odds, OddsAndEvensGamePlayer evens) {
		this.players = new OddsAndEvensPlayers(odds, evens);
		this.odds = new OddsAndEvensPlayerInMatch(odds, this);
		this.evens = new OddsAndEvensPlayerInMatch(evens, this);
		this.numbers= new HashMap<>(2);
	}

	//created after some valid move
	public OddsAndEvensMatch(OddsAndEvensMatch match, OddsAndEvensValidMove move ) {
		this.odds = match.odds;
		this.evens = match.evens;
		this.numbers = match.numbers;
		this.numbers.put(move.player(), move.number());
	}
	
	public Map<OddsAndEvensPlayerInMatch, Integer> numbers() {
		return this.numbers;
	}

	@Override
	public OddsAndEvensResult result() {
		if(numbers.get(this.evens) != null && numbers.get(this.odds) != null) {
			return (numbers.get(this.evens) + numbers.get(this.odds)) % 2 != 0 ?
					new OddsAndEvensWinResult(new OddsAndEvensPlayers(this.evens), new OddsAndEvensPlayers(this.odds), this.numbers.get(this.evens) , numbers.get(this.odds) ): 
						new OddsAndEvensWinResult(new OddsAndEvensPlayers(this.odds), new OddsAndEvensPlayers(this.evens), numbers.get(this.evens) , numbers.get(this.odds));
		}
		else
			return new OddsAndEvensPartialResult(this);
	}

}
