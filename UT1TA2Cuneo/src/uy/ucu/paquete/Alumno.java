package uy.ucu.paquete;
import uy.ucu.paquete.Carrera;
import java.util.ArrayList;


public class Alumno {
	
	private String nombre;
	private String apellido;
	private int cedula;
	private String telefono;
	private Carrera carrera;
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
	public int getCedula() {
	    return cedula;
	}
	public void setCedula(int cedula) {
	    this.cedula = cedula;
	}
	///////////////////////////////////////////
	public String getTelefono() {
	    return telefono;
	}
	public void setTelefono(String telefono) {
	    this.telefono = telefono;
	}
	///////////////////////////////////////////
	public Carrera getCarrera() {
	    return carrera;
	}
	public void setCarrera(Carrera carrera) {
	    this.carrera = carrera;
	}
	///////////////////////////////////////////
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrera ingenieria = new Carrera();
		ingenieria.setAlumnos(0);
		ingenieria.setNombre("Ingenieria");
		
		Alumno a = new Alumno();
		a.setNombre("Seba");
		a.setApellido("Cuneo");
		a.setCedula(56359871);
		a.setTelefono("092647004");
		a.setCarrera(ingenieria);
		
		
		System.out.println(a.getNombre()+"\n"+a.getApellido()+"\n"+ a.getCedula()+"\n"+ a.getTelefono()+"\n"+ a.getCarrera().getNombre());
	}

}
