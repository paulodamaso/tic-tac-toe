package oddsandevens.match;

import java.util.HashMap;
import java.util.Map;

import game.match.Match;
import game.player.Player;
import oddsandevens.move.OddsAndEvensValidMove;
import oddsandevens.player.BaseOddsAndEvensPlayer;
import oddsandevens.player.OddsAndEvensGamePlayer;
import oddsandevens.player.OddsAndEvensMatchPlayer;
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

	private final OddsAndEvensMatchPlayer odds;
	private final OddsAndEvensMatchPlayer evens;
	private final Map<BaseOddsAndEvensPlayer, Integer> numbers;

	//starting new match
	public OddsAndEvensMatch(OddsAndEvensGamePlayer odds, OddsAndEvensGamePlayer evens) {
		this.odds = new OddsAndEvensMatchPlayer(odds, false, this);
		this.evens = new OddsAndEvensMatchPlayer(evens, false, this);
		this.numbers= new HashMap<>(2);
	}

	//created after some move
	public OddsAndEvensMatch(OddsAndEvensMatch match, OddsAndEvensValidMove move ) {
		this.odds = match.odds;
		this.evens = match.evens;
		this.numbers = match.numbers;
		this.numbers.put(move.player(), move.number());
	}
	
	public Map<BaseOddsAndEvensPlayer, Integer> numbers() {
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
