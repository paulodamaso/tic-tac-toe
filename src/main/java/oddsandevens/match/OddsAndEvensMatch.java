package oddsandevens.match;

import java.util.HashMap;
import java.util.Map;

import game.match.Match;
import oddsandevens.move.OddsAndEvensValidMove;
import oddsandevens.player.OddsAndEvensPlayer;
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

	private final OddsAndEvensPlayer odds;
	private final OddsAndEvensPlayer evens;
	private final Map<OddsAndEvensPlayer, Integer> numbers;
	
	
	//starting new match
	public OddsAndEvensMatch(OddsAndEvensPlayer odds, OddsAndEvensPlayer evens) {
		this.odds = odds;
		this.evens = evens;
		this.numbers= new HashMap<>(2);
	}

	//created after some move
	public OddsAndEvensMatch(OddsAndEvensMatch match, OddsAndEvensValidMove move ) {
		this.odds = match.odds;
		this.evens = match.evens;
		this.numbers = match.numbers;
		this.numbers.put(move.player(), move.number());
	}
	
	public Map<OddsAndEvensPlayer, Integer> numbers() {
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

	@Override
	public OddsAndEvensPlayers players() {
		return new OddsAndEvensPlayers(this.evens, this.odds);
	}
}
