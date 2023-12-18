package poliformismo;

public class Perro extends Animal{

	public Perro() {
		super();
	}

	public Perro(String nombre) {
		super(nombre);
		System.out.println("constructor perro, nombre" + nombre);
	}

	@Override
	public void tipoAnimal() {
		System.out.println("Tipo animal: es un perro");
	}
	
	//comunicarse
		//El override no es necesario porque ya está implementado en animal
	public void comunicarse() {
			System.out.println("Metodo comunicarse:perro ladra guau");
	}
	
}
