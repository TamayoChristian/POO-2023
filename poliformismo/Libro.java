package poliformismo;

import java.util.List;

public class Libro extends Publicación{
	private String ISBN;
	//Arraylist tipo tomo
	List<Tomo> listaVolumenes;
	
	public Libro(){
		
	}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public List<Tomo> getListaVolumenes() {
		return listaVolumenes;
	}

	public void setListaVolumenes(List<Tomo> listaVolumenes) {
		this.listaVolumenes = listaVolumenes;
	}

	@Override
	protected void setExtension(Object informacion) {
		// Desencapsular al objeto información y luego agregarle a la lista volumenes
		listaVolumenes = (List<Tomo>)informacion;
	}

	@Override
	protected Object getExtencion() {
		return listaVolumenes;
	}

	//metodo para saber el tamaño de lista volumenes
	public int getNumeroVolumenes() {
		return listaVolumenes.size();
	}
}
