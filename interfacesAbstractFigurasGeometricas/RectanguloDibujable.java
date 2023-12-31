package interfacesAbstractFigurasGeometricas;

import java.awt.Graphics;

public class RectanguloDibujable extends Rectangulo implements FiguraDibujable{

	//variables
	private int x,y;
	
	public RectanguloDibujable(Double valor1, double valor2, int x, int y) {
		super(valor1, valor2);
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void setCoordenadas(int x, int y) {
		this.y = y;
		this.x = x;
		
	}

	@Override
	public void dibujar2D(Graphics g) {
		g.drawRect(this.x, this.y, (int)this.valor1, (int)this.valor2);
		
	}
	
}
