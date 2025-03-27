package ucu;

public class Usuario {

	private String nombre;
	private String apellido;
	private int numeroIdentidad;
	private Libro[] librosPrestados;
	
	///////////////////////////////////////////
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	///////////////////////////////////////////
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	///////////////////////////////////////////
	public int getNumeroIdentidad() {
		return numeroIdentidad;
	}
	public void setNumeroIdentidad(int numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	///////////////////////////////////////////
	public Libro[] getLibrosPrestados() {
		return librosPrestados;
	}
	public void setLibrosPrestados(Libro[] librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
	///////
	///
	
	

	//CONSTRUCTOR
	public Usuario() {
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.numeroIdentidad = numeroIdentidad;
	    this.librosPrestados = new Libro[5];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int cantidadLibrosPrestados() {
	    int contador = 0;
	    for (Libro l : librosPrestados) {
	        if (l != null) {
	            contador++;
	        }
	    }
	    return contador;
	}

}
