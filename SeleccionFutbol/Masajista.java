package SeleccionFutbol;

public class Masajista extends SeleccionFutbol {
	public String titulación;
	public int aniosdeExperiencia;

	//constructor 
	public Masajista() {
		
	}
	public Masajista(int id, String nombre, String apellido, int edad, String titulación, int aniosdeExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulación=titulación;
		this.aniosdeExperiencia=aniosdeExperiencia;
	}
	
	//getters and setters
	
	public String getTitulación() {
		return titulación;
	}
	public void setTitulación(String titulación) {
		this.titulación = titulación;
	}
	public int getAniosdeExperiencia() {
		return aniosdeExperiencia;
	}
	public void setAniosdeExperiencia(int aniosdeExperiencia) {
		this.aniosdeExperiencia = aniosdeExperiencia;
	}
	
	//metodos
	public void darMasaje() {
		
	}
	

	

	
}
