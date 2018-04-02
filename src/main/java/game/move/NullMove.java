package game.move;


import game.match.Match;
import game.player.NullPlayer;
import game.player.PlayerInMatch;

/**
 * <p> A null move; a move object representing move that is empty and that does not changes the match state.
 * 
 * <p> Null moves are empty moves that does not change the match they belong. They are made by a {@link PlayerInMatch}
 * over a {@link Match} and are created by {@link NullPlayer}s, representing its inability to create moves.
 * 
 * @author paulodamaso
 */
public final class NullMove extends InvalidMove	 {

	private final Match match;
	private final PlayerInMatch player;	
	
	public NullMove(Match match, PlayerInMatch player) {
		this.match = match;
		this.player = player;
		super(this);
	}

	/* (non-Javadoc)
	 * @see game.move.Move#player()
	 */
	@Override
	public PlayerInMatch player() {
		return this.player;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((match == null) ? 0 : match.hashCode());
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NullMove other = (NullMove) obj;
		if (match == null) {
			if (other.match != null)
				return false;
		} else if (!match.equals(other.match))
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		return true;
	}

	@Override
	public EvaluatedMove evaluate() {
		return null;
	}
	
}
