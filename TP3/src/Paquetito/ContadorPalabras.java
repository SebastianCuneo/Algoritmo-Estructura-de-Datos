package Paquetito;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

	    // Retorna un vector de Strings con las líneas contenidas en el archivo y muestra la cantidad de líneas leídas.
	    public String[] leerLineasArchivo(String path) {
	        ArrayList<String> lineas = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                lineas.add(linea);
	            }
	        } catch (IOException e) {
	            System.out.println("Error al leer el archivo: " + e.getMessage());
	        }
	        System.out.println("Cantidad de líneas leídas: " + lineas.size());
	        return lineas.toArray(new String[lineas.size()]);
	    }
	    
	    // Dado un vector de Strings con líneas de texto, retorna la cantidad total de palabras.
	    public int contarPalabrasEnLineas(String[] lineas) {
	        int totalPalabras = 0;
	        for (String linea : lineas) {
	            if (linea != null && !linea.trim().isEmpty()) {
	                // Separa la línea en palabras usando espacios (uno o más)
	                String[] palabras = linea.trim().split("\\s+");
	                totalPalabras += palabras.length;
	            }
	        }
	        return totalPalabras;
	    
	}
}
