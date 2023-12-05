package herencia;

public class Coche extends Vehiculo{
	public int ruedas = 4;
	public int gasolina;
	
	public Coche() {
	
	}
	
	public Coche(int ruedas, double velocidad, int gasolina) { //copia los atributos del padre.
		super(ruedas, velocidad); //el super hace referencia los atributos del padre.
		this.gasolina = gasolina;
	
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		//redefine las variables
		ruedas = 4;
		this.ruedas = ruedas;
	}

	public int getGasolina() {
		return gasolina;
	}

	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	
	
}
