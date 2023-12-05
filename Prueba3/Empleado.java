package Prueba3;

public class Empleado extends Persona{

	public double sueldoBruto;
	
	public Empleado(String nombre, int edad, double sueldoBruto) {
		super(nombre, edad);
		this.sueldoBruto = sueldoBruto;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double calcular_salario_neto() {
		return this.sueldoBruto-20;
	}
	@Override
	public void mostar() {
		super.mostar();
		System.out.println("Sueldo bruto: " + sueldoBruto);
		System.out.println("Sueldo neto: " + this.calcular_salario_neto());
	}
}
