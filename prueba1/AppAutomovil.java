package prueba1;

public class AppAutomovil {

	public static void main(String[] args) {
		Ambulancia ambulancia = new Ambulancia("Blanco");
		ambulancia.encender(); //metodo propio
		ambulancia.pintar(); //del padre
		
		Camion camion = new Camion("Rojo", true);
		System.out.println("El camión está cargado: " + camion.isEstaCargado());
		camion.pintar();
		
		Deportivo deportivo = new Deportivo("azul", 200);
		System.out.println("El deportivo tiene una potencia de  " + deportivo.potencia);
		deportivo.pintar();
	}

}
