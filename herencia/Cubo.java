package herencia;

public class Cubo extends Cuadrado{

	//constructor
	public Cubo(int valor1) {
		super(valor1);
	}
	
	//sobrecarga u override
	public double getArea() {
		return Math.pow(this.valor1, 3);
	}
	
	
}
