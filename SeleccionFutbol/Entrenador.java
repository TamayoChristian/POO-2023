package SeleccionFutbol;

public class Entrenador extends SeleccionFutbol{
	public String idFederacion;

	//constructor 
	
	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion=idFederacion;
	}
	
	//metodos
	
	public void dirigirPartido() {
		
	}
	
	public void Entrenamiento() {
		
	}
	
	
}
