package herencia_ejercicio;

public class publicacion {
	public String Editorial = "Don Bosco";
	public int anio = 2014;
	public int mes = 7;
	public int dia = 7;
	
	//constructores
	public publicacion() {
		
	}
	
	public publicacion(String editorial, int anio, int mes, int dia) {
		Editorial = editorial;
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
}
