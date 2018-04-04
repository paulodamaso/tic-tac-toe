package newGame.player;

import java.util.Collection;

public interface Players<P extends Player> {

	public P add(Player player);
	public Collection<P> iterate();
	public P next();
	public P previous();
}
