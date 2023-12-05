package herencia_ejercicio2;

public class Profesor extends Persona{

	public int salario;
	
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, int edad, int salario) {
		super(nombre, edad);
		this.salario = salario;
	}


	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public void visualizar() {
		System.out.println("----------Profesor----------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Salario: " + salario + " dolares");
		
	}

}
