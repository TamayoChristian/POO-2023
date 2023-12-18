package poliformismo;


public class Revista extends Publicación{

	private String SSn, perioricidad;
	private int numero, numeroDePaginas;
	
	public Revista() {
		super();
	}

	public String getSSn() {
		return SSn;
	}

	public void setSSn(String sSn) {
		SSn = sSn;
	}

	public String getPerioricidad() {
		return perioricidad;
	}

	public void setPerioricidad(String perioricidad) {
		this.perioricidad = perioricidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	//Metodos
	@Override
	protected void setExtension(Object informacion) {
		// Desencapsular los valores tipo object
		numeroDePaginas = ((Integer)informacion).intValue();
	}

	@Override
	protected Object getExtencion() {
		return Integer.valueOf((int) numeroDePaginas);
	}

}
