package poliformismo;

public class AppAnimal {

	public static void main(String[] args) {
		//operaciones poliorficas
		//crear un animal de tipo perro
		
		Animal animal = new Perro(" Bobby");
		animal.tipoAnimal();
		animal.comunicarse();
		System.out.println();
		
		//objeto tipo perro
		Perro perro = new Perro(" Hercules ");
		perro.tipoAnimal();
		System.out.println();
		
		//crear objeto piliformico, tipo perro de tipo animal
		//Una referencia a un objeto
		Animal animalPoli = perro;
		animalPoli.tipoAnimal();
		System.out.println();
		
		//objeto gato de tipo animal
		Animal gato = new Gato(" Lola ");
		gato.tipoAnimal();
		gato.comunicarse();
		System.out.println();
		
		//objeto desde la interfaz
		IAnimal gato2Animal = new Gato(" Lana ");
		gato2Animal.comunicarse();
		
		//array de objeto con los metodos disponibles
		Animal animales[]= {new Perro(" Simón "), new Perro(" Paco "),
							new Gato(" Mimi "),  new Perro(" Rocky ")};
		//array de objetos de tipo animal y recorrerlos
		for (Animal a: animales) {
			System.out.println(a.getNombre());
			a.tipoAnimal();
			a.comunicarse();
		}
	}

}
