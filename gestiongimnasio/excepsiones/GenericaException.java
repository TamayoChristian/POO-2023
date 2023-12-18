package gestiongimnasio.excepsiones;

public class GenericaException {
	private int codigoError;
	
	public GenericaException(int codigoError) {
		this.codigoError=codigoError;
	}
	
	public int getCodigoError() {
		return codigoError;
	}
}
