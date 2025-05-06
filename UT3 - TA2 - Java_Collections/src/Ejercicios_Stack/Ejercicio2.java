package Ejercicios_Stack;

import java.util.Stack;

public class Ejercicio2 {

	public void ParentesisBalanceados(String cadena) {
		Stack<Character> pila = new Stack<>();
		int ParentesisAbierto = 0;
		int ParentesisCerrado = 0;
		for (int i = 0; i < cadena.length(); i++) {
			pila.push(cadena.charAt(i));
			
			for(int y = 0; y < pila.size(); y++) {
				if(pila.get(y) == '(') {
					ParentesisAbierto++;
				}else if(pila.get(y) == ')') {
					ParentesisCerrado++;
				}
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
