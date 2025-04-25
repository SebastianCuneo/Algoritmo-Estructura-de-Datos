package Ejercicios_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2 {
	
	public void EliminarMultiplosTres(){
		Queue <Integer> numeros = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			numeros.add(i);
		}
		int size = numeros.size();
		
		for (int i = 0; i < size; i++) {
	        int current = numeros.poll();
	        if (current % 3 != 0) {
	            numeros.add(current);
	        }
	        System.out.println("Numeros en la cola: " + numeros);
	    }
		System.out.println("Numeros en la cola: " + numeros);
	}
	
	public static void main(String[] args) {

		Ejercicio2 ejercicio = new Ejercicio2();
		ejercicio.EliminarMultiplosTres();
	}

}
