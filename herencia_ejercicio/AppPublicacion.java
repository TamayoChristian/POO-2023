package herencia_ejercicio;

public class AppPublicacion {

	public static void main(String[] args) {
		
		//objetos
		Revista revista = new Revista();
		Libro libro = new Libro();
		
		//información de revista
		
		revista.setEjemplares(190);
		revista.setPeriocidad(2);
		
		//Información de libro
		libro.setAutor("Walter España");
		libro.setIsbn(9483234);
		
		//Mostrar datos
		System.out.println("---------------Revista---------------");
		System.out.println("Editorial: " + revista.Editorial);
		System.out.println("Fecha de publicación: " + revista.dia + "/" + revista.mes + "/" + revista.anio);
		System.out.println("Número de ejemplares: " + revista.ejemplares);
		System.out.println("Perioricidad: " + "Cada " + revista.periocidad + " semanas");
		
		System.out.println("---------------Libro---------------");
		System.out.println("Editorial: " + libro.Editorial);
		System.out.println("Fecha de publicación: " + libro.dia + "/" + libro.mes + "/" + libro.anio);
		System.out.println("Autor: " + libro.autor);
		System.out.println("ISBN: " + libro.isbn);
		
	}

}
