package poliformismo;

public class Gato extends Animal{

	
	public Gato() {
		super();
	}

	
	public Gato(String nombre) {
		super(nombre);
		System.out.println("constructor gato" + nombre);
	}

	//abstracto 
	@Override
	public void tipoAnimal() {
		System.out.println("Tipo animal: es un gato");
	}
	
	//comunicarse
	//El override no es necesario porque ya está implementado en animal
	public void comunicarse() {
		System.out.println("Metodo comunicarse:gato maulla miau");
	}
	
}
