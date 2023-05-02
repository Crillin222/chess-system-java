package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//CONSTRUCTOR (ONLY BOARD)
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//GETTERS AND SETTERS (ONLY GET)
	protected Board getBoard() {
		return board;
	}
}
