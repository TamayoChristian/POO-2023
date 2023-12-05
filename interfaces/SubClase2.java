package interfaces;

public class SubClase2 implements Super{

	@Override
	public void visualizarCadena() {
		System.out.println("Visualizar Cadena Subclase2 - tarjeta de credito");
	}

	@Override
	public int devolverNumero() {
		return 10;
	}

}
