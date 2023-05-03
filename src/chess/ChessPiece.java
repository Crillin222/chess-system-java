package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	//CONSTRUCTOR
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//GETTERS E SETTERS (ONLY GET SO PIECE COLOR CANT BE CHANGED)
	public Color getColor() {
		return color;
	}
}
