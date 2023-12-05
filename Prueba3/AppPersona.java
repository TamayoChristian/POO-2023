package Prueba3;

public class AppPersona {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("Google");
		Empleado empleado = new Empleado("César", 69, 32423);
		
		//agregar el objeto empleado dentro de empresa
		empresa.setEmpleado(empleado);
		
		System.out.println(empleado);
		empresa.getEmpleado().mostar();
	}
}
