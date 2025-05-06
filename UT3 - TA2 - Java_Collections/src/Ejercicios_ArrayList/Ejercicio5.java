package Ejercicios_ArrayList;

import java.util.ArrayList;

public class Ejercicio5 {
	
	public static float sumarElementosArray(ArrayList<Float> lista) {
		float suma = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i);
		}
		return suma;
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Float> lista = new ArrayList<>();
		lista.add(1.5f);
		lista.add(2.5f);
		System.out.println(sumarElementosArray(lista));
	}
}
