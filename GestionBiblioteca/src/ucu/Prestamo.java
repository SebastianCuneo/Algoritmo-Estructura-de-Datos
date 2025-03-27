package ucu;
import java.time.LocalDate;

public class Prestamo {
	
	private Libro libro;
	private Usuario usuario;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = null;
    }

	public void registrarDevolucion() {
        this.fechaDevolucion = LocalDate.now();
    }
	
    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucionEsperada() {
        return fechaDevolucion;
    }

    public String mostrarDatos() {
        String texto = "📘 Título: " + libro.getTitulo() +
                       "\n👤 Usuario: " + usuario.getNombre() + " " + usuario.getApellido() +
                       "\n📅 Fecha de préstamo: " + fechaPrestamo;

        if (fechaDevolucion != null) {
            texto += "\n🔁 Fecha de devolución: " + fechaDevolucion;
        } else {
            texto += "\n🔁 El libro aún no fue devuelto";
        }

        return texto;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
