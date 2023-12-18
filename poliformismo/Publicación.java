package poliformismo;
/**
 * publicacion
 * dos clases libro y revista hijas y tomo que es aparte.
 * y luego metodos para ingresar y obtener información
 * abstract de objeto e igualmente manejo de la clase object
 */
public abstract class Publicación {
	public String titulo, autor;
	private int precio;
	
	//metodos abstract de objeto
	//Object es el padre de todas las clases de java
	//implementar o onstanciar cualquier clase considerando a Object como padre
	
	protected abstract void setExtension(Object informacion);
	protected abstract Object getExtencion();
	
	public Publicación() {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
