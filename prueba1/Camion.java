package prueba1;

public class Camion extends Automovil{
	private boolean estaCargado;
	
	//constuctor
	public Camion(String color, boolean estaCargado) {
		super(color);
		this.estaCargado=estaCargado;
	}

	//metodos
	public boolean isEstaCargado() {
		return estaCargado;
	}

	public void setEstaCargado(boolean estaCargado) {
		this.estaCargado = estaCargado;
	}
}
