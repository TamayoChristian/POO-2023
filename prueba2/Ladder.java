package prueba2;

public class Ladder {
	private BoardSquare inicio;
	private BoardSquare fin;

	
	public Ladder(BoardSquare inicio, BoardSquare fin) {
		super();
		this.inicio=inicio;
		this.fin=fin;
	}
	
	public void movePlayerPiece(PlayerPiece x) {
		System.out.println("Clase ladder");
	}

	public BoardSquare getInicio() {
		return inicio;
	}

	public void setInicio(BoardSquare inicio) {
		this.inicio = inicio;
	}

	public BoardSquare getFin() {
		return fin;
	}

	public void setFin(BoardSquare fin) {
		this.fin = fin;
	}
	
	
}
