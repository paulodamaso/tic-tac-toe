package oddsandevens;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import oddsandevens.player.OddsAndEvensPlayer;
import oddsandevens.player.OddsAndEvensPlayers;

/**
 * <p> {@link OddsAndEvensPlayers} test class.
 * 
 * @author paulodamaso
 *
 */
public class OddsAndEvensPlayersTest {

	public OddsAndEvensPlayersTest() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p> Test the {@link OddsAndEvensPlayers#player()} method.
	 * 
	 * <p>Tests:
	 * <ul>
	 * 	<li> the first call to the method must return the player one</li>
	 *  <li> the second call to the method must return the player two</li>
	 *  <li> the fifteenth call to the method must return the player one</li>
	 *  <li> the twentieth call to the method must return the player two</li>
	 * </ul>
	 * 
	 */
	@Test	
	public void testPlayer() {
	
		OddsAndEvensPlayer player1 = new OddsAndEvensPlayer("Player1", true);//player one is even
		OddsAndEvensPlayer player2 = new OddsAndEvensPlayer("Player2", false);//player two is odd
		
		OddsAndEvensPlayers players = new OddsAndEvensPlayers(player1, player2);
		
		//first player must be player 1
		assertEquals(player1, players.next());
		
		//second player must be player 2
		assertEquals(player2, players.next());
		
		//reseting the players object
		players = new OddsAndEvensPlayers(player1, player2);
		
		//calling 14 times
		for (int i = 0; i< 14; i++) {
			players.next();
		}
		
		//15th call, must return player 1
		assertEquals(player1, players.next());
		
		//reseting the players object
		players = new OddsAndEvensPlayers(player1, player2);
		
		//calling 19 times
		for (int i = 0; i< 14; i++) {
			players.next();
		}
		
		//20th call, must return player 2
		assertEquals(player1, players.next());
		
	}

}
