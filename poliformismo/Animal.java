package poliformismo;

public abstract class Animal implements IAnimal{
	
	public String nombre;
	
	public Animal() {
		
	}
	public Animal(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor animal" + this.nombre);
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//implementar el metodo de la interfaz
	public void comunicarse() {
		System.out.println("Metodo comunicarse: Animal");
	}
	
	//un metodo abstracto
	public abstract void tipoAnimal();
}
