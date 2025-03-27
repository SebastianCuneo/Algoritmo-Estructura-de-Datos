package uy.ucu.paquete;

public class Carrera {
	//variables
	private String nombre;
	private int alumnos;
	
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	
	public int getAlumnos() {
	    return alumnos;
	}

	public void setAlumnos(int alumnos) {
	    this.alumnos = alumnos;
	}
	
	public void caracteristicas() {
		System.out.println(nombre);
		System.out.println(alumnos);
		
	}
	
	public static void main(String[] args) {

		Carrera rice1 = new Carrera();
		rice1.setNombre("Desarrollador de software");
		rice1.setAlumnos(15);
		
		Carrera rice2 = new Carrera();
		rice2.setNombre("Contador");
		rice2.setAlumnos(10);
		
		int alumno1 = rice1.getAlumnos();
		int alumno2 = rice2.getAlumnos();
		int suma = alumno1 + alumno2;
		System.out.print("Suma de alumnos: " + suma );
		
		System.out.println("\ncaracteristicas:");
		rice1.caracteristicas();
		rice2.caracteristicas();
		
		System.out.println("Candidad mayor de alumnos: ");
		if (alumno1>alumno2) {
			System.out.println(alumno1);
		}else {
			System.out.println(alumno2);
		}
	
	}

}
