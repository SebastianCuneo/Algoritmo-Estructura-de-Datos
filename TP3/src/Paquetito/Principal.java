package Paquetito;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ContadorPalabras cp = new ContadorPalabras();

	        String frase1 = "Hola mundo";
	        System.out.println("Frase 1: " + cp.ContarPalabras(frase1, 8) + " palabras"); // 2
	        
	        String frase2 = "Hola mu ndoo ";
	        System.out.println("Frase 2: " + cp.ContarPalabras(frase2, 3) + " palabras"); // 3
	        
	        String rutaArchivo = "src/Paquetito/texto.txt";
	        String[] lineas = cp.leerLineasArchivo(rutaArchivo);
	        
	        int totalPalabrasEnArchivo = cp.contarPalabrasEnLineas(lineas);
	        System.out.println("Total de palabras en el archivo: " + totalPalabrasEnArchivo);
	}

}
