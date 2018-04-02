package oddsandevens.match;

import java.util.HashMap;
import java.util.Map;

import game.Game;
import game.match.Match;
import game.player.MatchPlayers;
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

	private final OddsAndEvensPlayers players;
	private final Map<OddsAndEvensPlayerInMatch, Integer> numbers;

	//starting new match
	public OddsAndEvensMatch(OddsAndEvensGamePlayer odds, OddsAndEvensGamePlayer evens) {
		this.players = new OddsAndEvensPlayers(this, odds, evens);
		this.numbers= new HashMap<>(2);
	}

	//created after some valid move
	public OddsAndEvensMatch(OddsAndEvensMatch match, OddsAndEvensValidMove move ) {
		this.players = match.players;
		this.numbers = match.numbers;
		this.numbers.put(move.player(), move.number());
	}
	
	public Map<OddsAndEvensPlayerInMatch, Integer> numbers() {
		return this.numbers;
	}

	@Override
	public OddsAndEvensResult result() {
		if(numbers.get(this.players.evens()) != null && numbers.get(this.players.odds()) != null) {
			return (numbers.get(this.players.evens()).intValue() + numbers.get(this.players.odds()).intValue()) % 2 != 0 ?
					new OddsAndEvensWinResult(new OddsAndEvensPlayers(this.players.evens()), new OddsAndEvensPlayers(this.players.odds()), this.numbers.get(this.players.evens()) , numbers.get(this.players.odds()) ): 
						new OddsAndEvensWinResult(new OddsAndEvensPlayers(this.players.odds()), new OddsAndEvensPlayers(this.players.evens()), numbers.get(this.players.odds()) , numbers.get(this.players.evens()));
		}
		else
			return new OddsAndEvensPartialResult(this);
	}

	@Override
	public MatchPlayers players() {
		return this.players;
	}

	@Override
	public Game game() {
		// TODO Auto-generated method stub
		return null;
	}

}
