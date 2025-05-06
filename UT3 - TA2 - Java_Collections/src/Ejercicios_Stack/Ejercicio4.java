package Ejercicios_Stack;

import java.util.Stack;

public class Ejercicio4 {

	public static void copiarPila(Stack<String> pila) {
		
		Stack<String> pilaAux = new Stack<>();
		pilaAux.addAll(pila);
		int size = pila.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(	pilaAux.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pila = new Stack<>();
		  pila.push("apple");
		  pila.push("banana");
		  copiarPila(pila);
	}

}
