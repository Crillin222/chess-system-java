package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//CONSTRUCTOR (ROWS E COLUMNS)
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//STANCING PIECE MATRIX WITH ROWS E COLUMNS QUANTITY INFORMED
		pieces = new Piece[rows][columns];
	}

	//GETTERS E SETTERS (ROWS E COLUMNS)
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
