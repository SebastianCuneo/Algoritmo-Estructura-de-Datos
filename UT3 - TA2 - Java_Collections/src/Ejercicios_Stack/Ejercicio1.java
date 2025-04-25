package Ejercicios_Stack;

import java.util.Stack;

public class Ejercicio1 {

	public void stack() {
		
		Stack <Integer> pila = new Stack<>();
		for(int i = 0; i < 11; i++) {
			pila.push(i);
		}
		System.out.println( "Elementos de la pila: " + pila);
		
		int tamanio = pila.size();
		
		for(int i = 0; i < tamanio; i++) {
			pila.pop();
		}
		System.out.println("Elementos de la pila: " + pila);

		
	}
	public static void main(String[] args) {

		Ejercicio1 ejercicio = new Ejercicio1();
		ejercicio.stack();
	}

}
