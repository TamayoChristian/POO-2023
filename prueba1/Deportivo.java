package prueba1;

public class Deportivo extends Automovil{

	public int potencia;
	
	//constructor
	public Deportivo(String color, int potencia) {
		super(color);
		this.potencia=potencia;
	}
	
	//metodos 
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
