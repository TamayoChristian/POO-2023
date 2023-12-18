package poliformismo;

import java.util.ArrayList;

public class ListaProfesores {
	//operaciones crud
	//generar un arraylist de tipo profesor
	
	private ArrayList<Profesor>listProfesores;
	
	//constructor
	public ListaProfesores() {
		//inicializar el arraylist de tipo profesor
		listProfesores = new ArrayList<Profesor>();
	}
	
	public void agregarProfesor(Profesor p) {
		listProfesores.add(p);
	}
	
	//listar
	public void listar() {
		System.out.println("Lista todos los profesores");
		for (Profesor p: listProfesores)
			System.out.println(p.toString());
	}
}
