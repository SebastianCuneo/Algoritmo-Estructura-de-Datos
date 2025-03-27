package ucu;

public class Libro {
	private String titulo;
	private String autor;
	private int añoPublicacion;
	private boolean disponiblidad;
	
	///////////////////////////////////////////
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	///////////////////////////////////////////
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	///////////////////////////////////////////
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	///////////////////////////////////////////
	public boolean getDisponibilidad() {
		return disponiblidad;
	}
	public void setDisponiblidad(boolean disponiblidad) {
		this.disponiblidad = disponiblidad;
	}
	//////////////////////////////////////////
	//CONSTRUCTOR
	/*
	public Libro(String titulo, String autor, int añoPublicacion) {
	    this.titulo = titulo;
	    this.autor = autor;
	    this.añoPublicacion = añoPublicacion;
	    this.disponiblidad = true; // Por defecto disponible
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
