import java.util.Scanner;

import game.match.Match;
import oddsandevens.match.OddsAndEvensMatch;
import oddsandevens.player.OddsAndEvensConsolePlayer;
import oddsandevens.player.OddsAndEvensRandomNumberPlayer;

/**
 * <p> Main class for games.
 * 
 * @author paulodamaso
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		String playerName = scanner.nextLine();
		

		Match match = new OddsAndEvensMatch(
				new OddsAndEvensConsolePlayer(playerName, scanner),
				new OddsAndEvensRandomNumberPlayer("Dummy Bot")
				);
		match.start();
		match.result().toString();
		
		scanner.close();
	}

}
