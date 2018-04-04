package newGame.player;

import newGame.action.Action;

public final class SimplePlayer implements Player {
	
	private final String name;

	public SimplePlayer(String name) {
		this.name = name;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Action act() {
		// TODO Auto-generated method stub
		//fuck no jaymz
		return null;
	}

}
