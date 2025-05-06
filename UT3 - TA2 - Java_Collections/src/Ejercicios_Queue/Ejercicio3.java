package Ejercicios_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio3 {

	public static void invertirPalabra(String palabra) {
		Queue<String> cola = new LinkedList<>();
		Stack<String> pila = new Stack<>();
		int palindromo = 0;
		
		for(int i = palabra.length()  - 1; i >= 0; i--) {
			cola.add(String.valueOf(palabra.charAt(i)));
		}
		for(int i = 0; i < palabra.length(); i++) {
			pila.push(String.valueOf(palabra.charAt(i)));
		}
		
		System.out.println("Cola: " + cola + " Pila: " + pila);
		
		for(int i = 0; i < palabra.length(); i ++) {
			if(cola.poll().equals(pila.pop())){
				palindromo ++;
			}
		}
		if(palindromo == palabra.length()) {
			System.out.println("Es palindromo " + palabra);
		}else {
			System.out.println("No es un palindromo " + palabra);
		}
		
			
	}
	
	public static void main(String[] args) {

		
		invertirPalabra("oroo");
	}

}
