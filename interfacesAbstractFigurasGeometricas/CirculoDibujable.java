package interfacesAbstractFigurasGeometricas;

import java.awt.Color;
import java.awt.Graphics;

public class CirculoDibujable extends Circulo implements FiguraDibujable{

	//variables
	private int x,y;
	
	//constructor
	public CirculoDibujable(int i, int x, int y) {
		super((double) i);
		this.x=x;
		this.y=y;
	}

	//Getters and Setters
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

	//metodos
	@Override
	public void setCoordenadas(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void dibujar2D(Graphics g) {
		g.setColor(Color.green);
		g.drawOval(this.x, this.y, (int)this.valor1, (int)this.valor1);
	}

}
