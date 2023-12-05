package herencia_ejercicio2;

public abstract class Persona {
	public String nombre;
	public int edad;

	//Constructores
	public Persona() {

	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//getters and setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//metodos
	
	public abstract void visualizar();
	
	
}
