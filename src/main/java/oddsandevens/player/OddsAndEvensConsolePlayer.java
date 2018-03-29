package oddsandevens.player;

import game.match.Match;
import game.player.Player;
import oddsandevens.move.OddsAndEvensValidMove;

public class OddsAndEvensConsolePlayer extends OddsAndEvensPlayer {

	public OddsAndEvensConsolePlayer(Player player, boolean even, Match match) {
		super(player, even, match);
		// TODO Auto-generated constructor stub
	}

	@Override
	public OddsAndEvensValidMove move() {
		// TODO Auto-generated method stub
		//read number from console
		
		return new OddsAndEvensValidMove(number, player, match);
	}

}
