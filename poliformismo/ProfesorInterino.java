package poliformismo;

import java.util.Calendar;

public class ProfesorInterino extends Profesor{
	//fecha
	private Calendar fechaComienzoTrabajo;
	
	public ProfesorInterino() {
		super();
	}

	public ProfesorInterino(String nombre, String apellido, int edad, String idPorfesor, Calendar fechaComienzoTrabajo) {
		super(nombre, apellido, edad, idPorfesor);
		this.fechaComienzoTrabajo=fechaComienzoTrabajo;
	}

	public Calendar getFechaComienzoTrabajo() {
		return fechaComienzoTrabajo;
	}

	public void setFechaComienzoTrabajo(Calendar fechaComienzoTrabajo) {
		this.fechaComienzoTrabajo = fechaComienzoTrabajo;
	}
	
	@Override
	public String toString() {
		return "Profesor interino [Fecha de Comienzo de Trabajo = ]" + fechaComienzoTrabajo + " " + super.toString() + "]";
	}
	
	
	
}
