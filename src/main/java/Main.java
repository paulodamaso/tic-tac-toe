import java.util.Scanner;

import newGame.guess.GuessMatch;
import newGame.player.SimplePlayer;

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
		
		GuessMatch guessMatch = new GuessMatch(new SimplePlayer(scanner.nextLine()));
		System.out.println(guessMatch.play().result());
		scanner.close();
	}

}
