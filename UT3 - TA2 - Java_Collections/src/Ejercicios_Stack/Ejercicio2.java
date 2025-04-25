package Ejercicios_Stack;

import java.util.Stack;

public class Ejercicio2 {

	public void ParentesisBalanceados(String cadena) {
		Stack<Character> pila = new Stack<>();
		int ParentesisAbierto = 0;
		int ParentesisCerrado = 0;
		for (int i = 0; i < cadena.length(); i++) {
			pila.push(cadena.charAt(i));
			if(cadena.charAt(i) == '(') {
				ParentesisAbierto++;
			}else if(cadena.charAt(i) == ')'){
				ParentesisCerrado++;
			}
		}
		if (ParentesisAbierto == ParentesisCerrado) {
			System.out.println("La cadena tiene los parentesis balanceados");
		}else {
			System.out.println("La cadena no tiene los parentesis balanceados");
		}		
	}
	
	public static void main(String[] args) {

		Ejercicio2 ejercicio = new Ejercicio2();
		String cadena = "(((a+b)*(c-d))";
		ejercicio.ParentesisBalanceados(cadena);

	}

}
