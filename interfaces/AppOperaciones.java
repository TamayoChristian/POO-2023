package interfaces;

public class AppOperaciones {

	public static void main(String[] args) {
		//web
		//servicio web
		//Aplicación de escritorio
		///Fronted: angular, vue, react, jsp
		//Ingresar los datos
		OperacionImplementacion operaciones = new OperacionImplementacion();
		//datos persona
		
		operaciones.insertarNombre(1, "Juan");
		operaciones.actualizarNombre("pedro");
		operaciones.ejecutar("Pablo");
		operaciones.EliminarNombre("Pablo");
	}

}
