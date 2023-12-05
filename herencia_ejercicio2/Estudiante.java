package herencia_ejercicio2;

public class Estudiante extends Persona{
	
	//atributos definidos.
	public int id;

	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, int edad, int id) {
		super(nombre, edad);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
	@Override
	public void visualizar() {
		System.out.println("----------Estudiante----------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("ID: " + id);
	}
}
