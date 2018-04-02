import java.util.Scanner;

import game.Game;
import game.match.Match;
import oddsandevens.OddsAndEvensGame;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.move.generator.OddsAndEvensConsoleMoveGenerator;
import oddsandevens.move.generator.OddsAndEvensRandomNumberMoveGenerator;
import oddsandevens.player.OddsAndEvensGamePlayer;

/**
 * <p> Main class for games.
 * 
 * @author paulodamaso
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine();
		scanner.close();

		Game<OddsAndEvensMove> game = new OddsAndEvensGame();
		Match match = new OddsAndEvensMatch(
				new OddsAndEvensGamePlayer(playerName, new OddsAndEvensConsoleMoveGenerator()), 
				new OddsAndEvensGamePlayer("Computer", new OddsAndEvensRandomNumberMoveGenerator()));
	}

}
