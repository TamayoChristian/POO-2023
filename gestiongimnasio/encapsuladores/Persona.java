package gestiongimnasio.encapsuladores;

public class Persona {
	private String dni, password, nombre;
	private Persona responsable;
	
	public Persona() {
		
	}
	
	public Persona(String dni, String password, String nombre, Persona responsable) {
		this.dni = dni;
		this.password = password;
		this.nombre = nombre;
		this.responsable = responsable;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona getResponsable() {
		return responsable;
	}
	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}
	
	//metodo para retornar todo el objeto persona
	public Persona instanciaTransferirObjetoEspecifico(Persona p) {
		return p;
	}
}
