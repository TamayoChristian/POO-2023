package poliformismo;

import java.util.ArrayList;
import java.util.List;

public class AppPublicación {
	public static void main(String[] args) {
		//objetyos y lugo acceder a sus propiedades
		
		Revista rv = new Revista();
		rv.setSSn("1234=3--33");
		rv.setPerioricidad("Mensual");
		rv.setNumero(2);
		rv.setTitulo("Tierra y vida");
		rv.setAutor("Martinez");
		rv.setPrecio(6);
		rv.setExtension(Integer.valueOf((int)80));
		
		Libro libro = new Libro();
		libro.setISBN("978-5-29-123456-0");
		libro.setTitulo("Mundo animal");
		libro.setAutor("Elena Pastor");
		libro.setPrecio(580);
		
		List<Tomo>listaVolumenes = new ArrayList();
		
		Tomo tomo1 = new Tomo();
		tomo1.setNumeroVolumen((byte)1);
		tomo1.setTitulo("Los mamiferos");
		tomo1.setNumeroPaginas(200);
		listaVolumenes.add(tomo1);
		
		Tomo tomo2 = new Tomo();
		tomo2.setNumeroVolumen((byte)2);
		tomo2.setTitulo("Los reptiles");
		tomo2.setNumeroPaginas(180);
		listaVolumenes.add(tomo2);
		
		libro.setExtension(listaVolumenes);
		
		System.out.println("---------REVISTA-------");
		System.out.println("ISSN: " + rv.getSSn());
		System.out.println("Perioricidad: " + rv.getPerioricidad());
		System.out.println("Número: " + rv.getNumero());
		System.out.println("Titulo: " + rv.getTitulo());
		System.out.println("Autor: " + rv.getAutor());
		System.out.println("Precio: " + rv.getPrecio());
		
		System.out.println("VOLUMENES: ");
		System.out.println("----------------");
		System.out.println("Número de volumenes de la obra: " + libro.getNumeroVolumenes());
		
		List<Tomo> listaVolumenesGet = (List<Tomo>) libro.getExtencion();
			for(int i = 0; i <listaVolumenesGet.size();i++) 
			{
				System.out.println("---------------------------");
				Tomo tomo = listaVolumenesGet.get(i);
				System.out.println("-Volumen----" + tomo.getNumeroVolumen());
				System.out.println("-Titulo-----" + tomo.getTitulo());
				System.out.println("-Num de paginas-" + tomo.getNumeroPaginas());
			}
	}
}
