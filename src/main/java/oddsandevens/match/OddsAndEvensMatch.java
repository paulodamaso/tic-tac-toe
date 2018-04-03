package oddsandevens.match;

import java.util.HashMap;
import java.util.Map;

import game.match.Match;
import oddsandevens.action.OddsAndEvensAction;
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
	private final Map<OddsAndEvensPlayerInMatch, OddsAndEvensAction> actions;

	//starting new match
	public OddsAndEvensMatch(OddsAndEvensGamePlayer odds, OddsAndEvensGamePlayer evens) {
		this.players = new OddsAndEvensPlayers(this, odds, evens);
		this.actions= new HashMap<>(2);
	}

	//created after some valid move
	public OddsAndEvensMatch(OddsAndEvensAction action, OddsAndEvensPlayerInMatch player ) {
		this.players = player.match().players();
		this.actions = player.match().numbers();
		this.actions.put(player, action);
	}
	
	public Map<OddsAndEvensPlayerInMatch, OddsAndEvensAction> numbers() {
		return this.actions;
	}

	@Override
	public OddsAndEvensResult result() {
		if(actions.get(this.players.evens()) != null && actions.get(this.players.odds()) != null) {
			return (actions.get(this.players.evens()).number().intValue() + actions.get(this.players.odds()).number().intValue()) % 2 != 0 ?
					new OddsAndEvensWinResult(new OddsAndEvensPlayers(this.players.evens()), new OddsAndEvensPlayers(this.players.odds())): 
						new OddsAndEvensWinResult(new OddsAndEvensPlayers(this.players.odds()), new OddsAndEvensPlayers(this.players.evens()));
		}
		else
			return new OddsAndEvensPartialResult(this);
	}

	@Override
	public OddsAndEvensPlayers players() {
		return this.players;
	}
}
