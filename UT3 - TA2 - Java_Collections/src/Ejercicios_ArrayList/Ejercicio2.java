package Ejercicios_ArrayList;

import java.util.ArrayList;

public class Ejercicio2 {

	public void  ImprimirListaInversa() {
		
		ArrayList<String> lista = new ArrayList<>();
		for(int i = 0; i < 11; i++) {
			lista.add("Elemento " + i);
		}
		// Imprimir la lista en orden inverso
		for(int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
		
		
	
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio2 ejercicio = new Ejercicio2();
		ejercicio.ImprimirListaInversa();
	}

}
