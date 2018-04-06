package oogame;

import game.match.Match;

/**
 * <p> Set of players which are playing a {@link Match}.
 * 
 * <p> This interface's purpose is to model the aggregation of players who are playing some 
 * {@link Match} instance. In addiction, this interface combines players to matches: 
 * adding a {@link Player} to this instantly associates it to the {@link Match} associated to 
 * this players instance, creating a {@link MatchPlayer} instance.
 * 
 * <p> This interface also has methods for obtaining the next player in turn, and the previous 
 * player to play. 
 * 
 * @author paulodamaso
 *
 * @param <P> an implementation of {@link Player}.
 */
public interface Players {

	/**
	 * <p>
	 * Add a {@link Player} to this set.
	 * 
	 * @param player
	 *            player to be added to this set
	 * @return new player added to this set,
	 */
	public MatchPlayer add(Player player);

	/**
	 * <p> Next player to play.
	 * 
	 * @return next {@link Player} in turn
	 */
	public MatchPlayer next();

	/**
	 * <p> {@link Player} which played last turn. 
	 * 
	 * @return 
	 */
	public MatchPlayer previous();
	

}
