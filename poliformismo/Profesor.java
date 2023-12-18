package poliformismo;

public class Profesor extends Persona{
	
	private String idPorfesor;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, String apellido, int edad, String idPorfesor) {
		super(nombre, apellido, edad);
		this.idPorfesor=idPorfesor;
	}

	public String getIdPorfesor() {
		return idPorfesor;
	}

	public void setIdPorfesor(String idPorfesor) {
		this.idPorfesor = idPorfesor;
	}
	
	
	public String toString() {
		super.toString();
		return "Profesor [idProfesro= " + idPorfesor + " ]";
	}
}
