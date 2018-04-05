package oddsandevens.player;

import java.util.Scanner;

import oddsandevens.action.OddsAndEvensAction;
import oddsandevens.action.OddsAndEvensActionImpl;
import oldgame.player.Player;

/**
 * <p> An odds and evens {@link Player} which receives input from the console
 * 
 * @author paulodamaso
 *
 */
public final class OddsAndEvensConsolePlayer extends OddsAndEvensGamePlayer {
	
	private final Scanner scanner;
	
	public OddsAndEvensConsolePlayer(String name, Scanner scanner) {
		super(name);
		this.scanner = scanner;
	}

	@Override
	public OddsAndEvensAction act() {
		System.out.println("Escreva seu nome: ");
		String playerName = scanner.nextLine();
		
		return new OddsAndEvensActionImpl(new Integer(playerName));
	}

}
