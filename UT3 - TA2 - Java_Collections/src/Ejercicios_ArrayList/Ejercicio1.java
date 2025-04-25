package Ejercicios_ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {

	public class Lista{
		
		ArrayList<Integer> var = new ArrayList<>();
		 // Constructor
        public Lista() {
            for (int i = 0; i < 11; i++) {
                var.add(i);
            }
        }
	}
	
	public void ImprimirPares(ArrayList<Integer> lista) {
		for(int i = 0; i < lista.size(); i++) {
			if( i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Ejercicio1 ejercicio = new Ejercicio1();
		Lista lista = ejercicio.new Lista();
		ejercicio.ImprimirPares(lista.var);
	}

}

