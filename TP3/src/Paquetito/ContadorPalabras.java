package Paquetito;

public class ContadorPalabras {
	
	public int ContarPalabras(String frase) {
		
		int contador = 1;
			
		if (frase.length() > 0 && frase.charAt(0) == ' ') {
		    frase = frase.substring(1);
		}

		if (frase.length() > 0 && frase.charAt(frase.length() - 1) == ' ') {
		    frase = frase.substring(0, frase.length() - 1);
		}
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)== ' ') {
				contador++;
			}
		}
		return contador;
	}
	
}
