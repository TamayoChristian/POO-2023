package SeleccionFutbol;

public class Futbolista extends SeleccionFutbol{
	
	//atributos
	public int dorsal;
	public String demarcacion;

	//constructor
	public Futbolista() {
		
	}
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
		
	}
	
	//metodos
	public void jugarPartido() {
		
	}
	
	public void entrenar() {
		
	}
	
	//getters and setters
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}	
	
}
