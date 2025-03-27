package ucu;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	private Libro[] libros;
	
	///////////////////////////////////////////
	public Libro[] getLibros() {
		return libros;
	}
	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
	////////////////
	
	public boolean reservarLibro(String titulo, Usuario usuario) {
		
		for(Libro libro : libros) {
			if(libro != null && libro.getTitulo().equalsIgnoreCase(titulo) && libro.getDisponibilidad()) {
				libro.setDisponiblidad(false);
				Libro[] prestados = usuario.getLibrosPrestados();
				for(int i = 0; i < prestados.length ; i++ ) {
					if (prestados[i] == null) {
	                    prestados[i] = libro;
	                    break;
	                }
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean devolverLibro(String titulo, Usuario usuario) {
	    Libro[] prestados = usuario.getLibrosPrestados();
	    for (int i = 0; i < prestados.length; i++) {
	        if (prestados[i] != null && prestados[i].getTitulo().equalsIgnoreCase(titulo)) {
	            prestados[i].setDisponiblidad(true);
	            prestados[i] = null;
	            return true;
	        }
	    }
	    return false;
	}
	
	public void mostrarLibrosDisponibles() {
	    for (Libro libro : libros) {
	        if (libro != null && libro.getDisponibilidad()) {
	            System.out.println(libro.getTitulo());
	        }
	    }
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Prestamo> prestamos = new ArrayList<>();


		// Crear libros
        Libro libro1 = new Libro();
        libro1.setTitulo("Principe");
        libro1.setAutor("George Orwell");
        libro1.setAñoPublicacion(1949);
        libro1.setDisponiblidad(true);

        Libro libro2 = new Libro();
        libro2.setTitulo("Cien años de soledad");
        libro2.setAutor("Gabriel García Márquez");
        libro2.setAñoPublicacion(1967);
        libro2.setDisponiblidad(true);
        
        Libro libro3 = new Libro();
        libro3.setTitulo("Celular magico");
        libro3.setAutor("yo");
        libro3.setAñoPublicacion(2025);
        libro3.setDisponiblidad(true);
        
        Libro libro4 = new Libro();
        libro4.setTitulo("Celular negro");
        libro4.setAutor("el");
        libro4.setAñoPublicacion(2020);
        libro4.setDisponiblidad(true);
        
        Libro libro5 = new Libro();
        libro5.setTitulo("Castillo ");
        libro5.setAutor("Juan");
        libro5.setAñoPublicacion(2010);
        libro5.setDisponiblidad(true);

        // Crear usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Ana");
        usuario.setApellido("Pérez");
        usuario.setNumeroIdentidad(123);
        usuario.setLibrosPrestados(new Libro[10]); // espacio para 10 libros

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();
        Libro[] listaLibros = new Libro[10];
        listaLibros[0] = libro1;
        listaLibros[1] = libro2;
        listaLibros[2] = libro3;
        listaLibros[3] = libro4;
        listaLibros[4] = libro5;
        biblioteca.setLibros(listaLibros);

        // Mostrar libros disponibles
        System.out.println("📚 Libros disponibles:");
        biblioteca.mostrarLibrosDisponibles();

        //Reservar
        while (true) {
        	// Verificamos si ya tiene 3 libros
            if (usuario.cantidadLibrosPrestados() >= 3) {
                System.out.println("⚠️ Ya tenés 3 libros prestados. No podés pedir más.");
                break;
            }
            System.out.print("Ingrese el título del libro a prestar: ");
            String tituloReserva = sc.nextLine();

            if (biblioteca.reservarLibro(tituloReserva, usuario)) {
                System.out.println("Libro prestado con éxito");
                
             // Buscar el libro reservado para asignarlo al préstamo
                Libro libroPrestado = null;
                for (Libro l : biblioteca.getLibros()) {
                    if (l != null && l.getTitulo().equalsIgnoreCase(tituloReserva)) {
                        libroPrestado = l;
                        break;
                    }
                }

                if (libroPrestado != null) {
                    Prestamo prestamo = new Prestamo(libroPrestado, usuario);
                    prestamos.add(prestamo);
                }
                
            } else {
                System.out.println("Libro no encontrado, intenta nuevamente");
            }

            System.out.println("Ingrese 1 si desea pedir otro libro, de lo contrario ingrese 0:");
            int numA = sc.nextInt();
            sc.nextLine(); // limpiar el salto de línea pendiente

            if (numA == 0) {
                break;
            }
        }
        
        System.out.println("Libros prestados");
        for( Libro L : usuario.getLibrosPrestados()) {
        	if (L != null) {
                System.out.println("- " + L.getTitulo());
            }
        }
    
       //devlover
        while(true) {
        	 System.out.println("Ingrese el titulo del libro a devolver: ");
             String tituloDevolucion = sc.nextLine();
             if(biblioteca.devolverLibro(tituloDevolucion, usuario)) {
             	System.out.println("Libro devuelto con exito");
             	
             	 for (Prestamo p : prestamos) {
                     if (p.getLibro().getTitulo().equalsIgnoreCase(tituloDevolucion) &&
                         p.getUsuario().getNumeroIdentidad() == usuario.getNumeroIdentidad() &&
                         p.getFechaDevolucionEsperada() == null) {

                         p.registrarDevolucion();
                         System.out.println("📄 Detalle del préstamo:");
                         System.out.println(p.mostrarDatos());
                         break;
                     }
                 }
             	
             	break;
             }else {
             	System.out.println("Libro no encontrado, intenta nuevamente");
             }
        }
       
        
        System.out.println("Estado final de la biblioteca: ");
        biblioteca.mostrarLibrosDisponibles();
        
        sc.close();

    }
}
