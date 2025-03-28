package Paquetito;

public class ContadorPalabras {
	
	public int ContarPalabras(String frase, int xCaracteres) {
		
		int cantidadVocales = 0;
		int cantidadConsonantes = 0;
		int contador = 1;
		int palabrasLargas = 0;
		int cantidadLetras = 0;
		int largoPalabra = 0;
			
		if (frase.length() > 0 && frase.charAt(0) == ' ') {
		    frase = frase.substring(1);
		}

		if (frase.length() > 0 && frase.charAt(frase.length() - 1) == ' ') {
		    frase = frase.substring(0, frase.length() - 1);
		}
		
        frase = frase.toLowerCase();
        
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			
			if(frase.charAt(i)== ' ') {
				contador++;
				
				// Al cerrar una palabra, evaluamos si era larga
				if(largoPalabra > xCaracteres) {
					palabrasLargas++;
				}
				largoPalabra = 0; // reiniciar para la próxima palabra

			}else if (Character.isLetter(c)) {
				if(esVocal(c)) {
					cantidadVocales ++;
				}else {
					cantidadConsonantes ++;
				}
				largoPalabra++;
			}
		}
		// Evaluar última palabra (por si no terminó con espacio)
				if(largoPalabra > xCaracteres) {
					palabrasLargas++;
				}
		///////////////////////////////////////////////////////
		
		System.out.println("Total vocales: " + cantidadVocales);
	    System.out.println("Total consonantes: " + cantidadConsonantes);
	    System.out.println("Total palabras: " + contador);
//	    if(xCaracteres < cantidadLetras) {
//	    	palabrasLargas ++;
//	    }
	    System.out.println("Cantidad palabras largas: " + palabrasLargas);
		return contador;
	}
	
	private boolean esVocal(char c) {
		if(c == 'a'|| c== 'e'||c == 'i' || c == 'o' || c == 'u' ) {
			return true;
		}else {
			return false;
		}
	}
}
