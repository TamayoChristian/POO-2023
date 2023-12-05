package herencia_ejercicio2;

public class AppPersona {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante();
		Profesor profesor = new Profesor();
		
		estudiante.setNombre("Kevin");
		estudiante.setEdad(18);
		estudiante.setId(398323);
		
		profesor.setNombre("Lazaro");
		profesor.setEdad(48);
		profesor.setSalario(600);
		
		estudiante.visualizar();
		profesor.visualizar();
		

	}

}
