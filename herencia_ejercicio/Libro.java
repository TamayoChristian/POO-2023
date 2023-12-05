package herencia_ejercicio;

public class Libro extends publicacion{
	public long isbn;
	public String autor;
	
	public Libro() {
		super();
	}
	public Libro(String editorial, int anio, int mes, 
			int dia, long isbn, String autor) {
		
		super(editorial, anio, mes, dia);
		this.isbn = isbn;
		this.autor = autor;
	}
	
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
