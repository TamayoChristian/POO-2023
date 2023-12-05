package SeleccionFutbol;

public class SeleccionFutbol {
	//atributos
	public int id;
	public String Nombre;
	public String Apellido;
	public int Edad;
	
	//constructor
	public SeleccionFutbol(){
		
	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		super();
		this.id = id;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Edad = edad;
	}
	
	//metodos
	void Concentrase() {
		
	}
	void Viajar() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
}
