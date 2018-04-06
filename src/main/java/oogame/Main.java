package oogame;
import java.util.Scanner;

import oogame.impl.GuessMatch;
import oogame.impl.SimplePlayer;

/**
 * <p> Main class for games.
 * 
 * @author paulodamaso
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write your OO name: ");
		
		GuessMatch guessMatch = new GuessMatch(new SimplePlayer(scanner.nextLine()));
		System.out.println(guessMatch.play().result());
		scanner.close();
	}

}
