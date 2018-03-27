package oddsandevens.match;

import java.util.HashMap;
import java.util.Map;

import game.match.Match;
import game.player.Player;
import game.result.Result;
import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.player.OddsAndEvensPlayer;
import oddsandevens.player.OddsAndEvensPlayers;

/**
 * <p> An odds and evens match.
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensMatch implements Match {

	private final OddsAndEvensPlayers oddsAndEvensPlayers;
	private final Map<Player, Integer> numbers;

	//starting new match
	public OddsAndEvensMatch(OddsAndEvensPlayer player1, OddsAndEvensPlayer player2) {
		this.oddsAndEvensPlayers = new OddsAndEvensPlayers(player1, player2);
		this.numbers = new HashMap<Player, Integer>(2);
		this.numbers.put(player1, new Integer(null));
		this.numbers.put(player2, new Integer(null));
	}
	
	//creating new instance after performing a move
	public OddsAndEvensMatch(OddsAndEvensPlayers players, OddsAndEvensMove move) {
		this.oddsAndEvensPlayers = players;
		this.numbers = new HashMap<Player, Integer>(2);
		this.numbers.put(players.next(), new Integer(null));
		this.numbers.put(players.next(), new Integer(null));
		this.numbers.put(move.player(), move.number());
	}
	

	@Override
	public OddsAndEvensPlayers players() {
		return this.oddsAndEvensPlayers;
	}

	@Override
	public Match check() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result result() {
		// TODO Auto-generated method stub
		return null;
	}

}
