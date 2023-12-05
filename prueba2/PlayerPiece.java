package prueba2;

public class PlayerPiece {
	private BoardSquare currentPosition;

	public BoardSquare getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(BoardSquare currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public BoardSquare moveTo(BoardSquare boardsquare) {
		System.out.println("PlayerPiece");
		return boardsquare;
	}
}
