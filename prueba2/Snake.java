package prueba2;

public class Snake {
	private BoardSquare t;
	private BoardSquare h;
	
	public Snake(BoardSquare t, BoardSquare h) {
		super();
		this.t = t;
		this.h = h;
	}
	
	public void movePlayerPiece(PlayerPiece x) {
		System.out.println("Clase culebra");
	}

	public BoardSquare getT() {
		return t;
	}

	public void setT(BoardSquare t) {
		this.t = t;
	}

	public BoardSquare getH() {
		return h;
	}

	public void setH(BoardSquare h) {
		this.h = h;
	}
	
	
}
