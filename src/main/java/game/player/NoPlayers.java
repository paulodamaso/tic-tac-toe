package game.player;

/**
 * <p> A empty {@link Players} object.
 * 
 * @author paulodamaso
 *
 */
public class NoPlayers implements Players {

	public NoPlayers() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Player next() {
		return null;
	}

}
