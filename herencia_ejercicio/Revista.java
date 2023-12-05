package herencia_ejercicio;

public class Revista extends publicacion{
	public int periocidad; //La perioricidad está expresada en semanas.
	public int ejemplares;
	
	public Revista() {
		super();
		}
	public Revista(String editorial, int anio, int mes, 
			int dia, int periocidad, int ejemplares) {
		
		super(editorial, anio, mes, dia);
		this.periocidad = periocidad;
		this.ejemplares = ejemplares;
	}
	
	public int getPeriocidad() {
		return periocidad;
	}
	public void setPeriocidad(int periocidad) {
		this.periocidad = periocidad;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	
}
