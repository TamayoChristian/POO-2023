package interfaces;

public class AppSuper {

	public static void main(String[] args) {
		//instancias objetos de las  subclases
		SubClase1 pagoEfectivo = new SubClase1();
		
		SubClase2 pagoTarjeta = new SubClase2();
		
		//invocación de los metodos de la subclase dependiendo del parametro objeto
		invocarMetodosSubclase(pagoEfectivo);
		invocarMetodosSubclase(pagoTarjeta);
	}
	//implementar el metodo de invocar metodos.
	public static void invocarMetodosSubclase(Super superior) {
		superior.visualizarCadena();
		System.out.println(superior.devolverNumero());
	}
}
