package Ejercicios_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio3 {

	public static String esPalindorme(String palabra) {
	    Stack<String> pila = new Stack<>();
	    Queue<String> cola = new LinkedList<>();

	    for (int i = 0; i < palabra.length(); i++) {
	        String c = Character.toString(palabra.charAt(i));
	        pila.push(c);
	        cola.add(c);
	    }

	    for (int i = 0; i < palabra.length(); i++) {
	        if (!pila.pop().equals(cola.poll())) {
	            return "No es palindromo: " + palabra;
	        }
	    }
	    return "Es palindromo: " + palabra;
	}
	public static void main(String[] args) {

		System.out.println(esPalindorme("oro"));
	}

}
