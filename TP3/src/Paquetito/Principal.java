package Paquetito;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ContadorPalabras cp = new ContadorPalabras();

	        String frase1 = "Hola mundo";
	        System.out.println("Frase 1: " + cp.ContarPalabras(frase1) + " palabras"); // 2
	        
	        String frase2 = "Hola mu ndo ";
	        System.out.println("Frase 2: " + cp.ContarPalabras(frase2) + " palabras"); // 3
	}

}
