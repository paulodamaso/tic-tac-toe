package oogame;


/**
* <p>
* A player in a game context is an entity which makes {@link Action}s which
* changes the {@link Match} state.
* 
* <p>
* The actions ({@link Action}) made by some player are created in the
* {@link #act()} method. Player interface must be implemented according to the
* game that is being played because its {@link Action}s are specific for that
* game type. Input type for player actions are defined decorating the
* player interface implementations.
* 
* <p>
* Each match player carry its {@link Match} reference, allowing it to create
* {@link Action} for that {@link Match} in particular.
* */
public interface MatchPlayer extends Player {

//	/**
//	 * <p>
//	 * An {@link Action} to be performed, created by this player.
//	 * 
//	 * @return {@link Action} made by this player
//	 */
//	public Action act();

	/**
	 * <p>
	 * The {@link Match} this player is currently playing.
	 * 
	 * @return {@link Match}
	 */
	public Match match();
}
