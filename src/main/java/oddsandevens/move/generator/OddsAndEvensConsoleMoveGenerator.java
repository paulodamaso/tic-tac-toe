package oddsandevens.move.generator;

import java.util.Scanner;

import oddsandevens.move.OddsAndEvensMove;
import oddsandevens.move.OddsAndEvensUnevaluatedMove;
import oddsandevens.player.OddsAndEvensPlayerInMatch;

public class OddsAndEvensConsoleMoveGenerator implements OddsAndEvensMoveGenerator {

	@Override
	public OddsAndEvensMove create(OddsAndEvensPlayerInMatch player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha um numero inteiro: ");
		int number = scan.nextInt();
		scan.close();
		
		return new OddsAndEvensUnevaluatedMove(player, new Integer(number));
	}

}
