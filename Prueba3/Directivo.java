package Prueba3;

public class Directivo extends Empleado{

	public String Categoria;
	public Directivo(String nombre, int edad, double sueldoBruto, String Categoria) {
		super(nombre, edad, sueldoBruto);
		this.Categoria = Categoria;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	@Override
	public void mostar() {
		super.mostar();
	}
}
