package Divide_Y_Venceras;

public class Ejercicio1 {

	//Dada una cadena de caracteres, escribir un método recursivo que la imprima en orden inverso. 
	//Por ejemplo, si se recibe la cadena "hola", debe imprimirse "aloh".
	
	public static String InvertirCadena(String chain) {
		if (chain.length() == 1) {
            System.out.print(chain.charAt(0)); // Caso base: si la cadena tiene un solo carácter, lo imprime
            return chain;
        }
		//Encuentro el medio y retorno la mitad derecha y la luego la izq
		int mid = chain.length()/2;
		return InvertirCadena(chain.substring(mid))+ InvertirCadena(chain.substring(0, mid)) ;
	
	}
	
	public static void main(String[] args) {

		String Chain = "hola";
		InvertirCadena(Chain);
	}

}
