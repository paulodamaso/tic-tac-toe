package game.match;

import game.action.Action;
import game.player.MatchPlayer;
import game.player.Player;
import game.result.Result;

/**
 * <p>
 * A match of some game.
 * 
 * <p>
 * A match is a contest where players compete against each other in a particular
 * game.
 * 
 * <p> The current match state is obtained through the {@link #result()} method: it returns an 
 * {@link Result} instance depicting the match internal state at some point in time. It may be 
 * used to track intermediate match states, showing  which {@link MatchPlayer} is nearer to 
 * achieve victory conditions when applicable, for example.
 * 
 * <p>
 * The {@link #play()} method start the match and perform the loop present in every match of every 
 * game: the {@link Player}s alternate themselves making {@link Action}s until the match is over 
 * ({@link Result} of the match is not partial). Each match implementation must provide this 
 * behavior; it can change from game to game. After its execution, the method returns the final
 * {@link Result} of the match, with the game ending information.
 * 
 * @author paulodamaso
 *
 */
public interface Match {

	/**
	 * <p>
	 * 
	 * @return
	 */
	public Result result();

	public Result play();
}
