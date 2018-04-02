package game.move;

/**
 * <p> A move that had not been evaluated yet.
 * 
 * <p> Move evaluation applies all rules of a particular game to the move, checking if this move is a valid move
 * or an invalid move within that game context.
 * 
 * @author paulodamaso
 *
 */
public interface UnevaluatedMove extends Move {

	public EvaluatedMove evaluate();
}
