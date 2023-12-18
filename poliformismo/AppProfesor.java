package poliformismo;

import java.util.Calendar;

public class AppProfesor {

	public static void main(String[] args) {
		//objeto de tipo profesor
		Profesor p1 = new Profesor("Juan", "Calle", 33, "Profe-123");
		//fecha para aagregar profesor interino
		Calendar fech1 = Calendar.getInstance();
		fech1.set(2021, 01,22);
		
		//objeto de tipo profesor interino
		ProfesorInterino pi= new ProfesorInterino("Pablo", "Alvarez", 54, "prof-23", fech1);
		//objeto tipo lista para profesores
		ListaProfesores listaProfes = new ListaProfesores();
		//agregar
		listaProfes.agregarProfesor(p1); //agragar profesor padre
		listaProfes.agregarProfesor(pi); //agregar profesor interino
		
		listaProfes.listar();
	}

}
