package interfaces;

public class OperacionImplementacion implements OperacionesCrud, OperacionesCrudEliminar{

	@Override
	public String EliminarNombre(String Nombre) {
		//Operaciones a la base de datos
		System.out.println("Nombre Eliminado Correctamente");
		return "ok-Eliminado";
	}

	@Override
	public String insertarNombre(int id, String nombre) {
		System.out.println("Nombre Instertado Correctamente");
		return "ok-insertado";
	}

	@Override
	public String actualizarNombre(String Nombre) {
		System.out.println("Nombre actualizado Correctamente");
		return "ok-Actualizado";
	}

	@Override
	public String ejecutar(String Nombre) {
		System.out.println("Nombre Ejecutado Correctamente");
		return "ok-Ejecutado";
	}
	
}
