package Ejercicios_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static boolean verificarPalabraEspecifica(List<String> lista) {
		
		
		for(String palabra : lista) {
			if(palabra.equalsIgnoreCase("hola")) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio4 ejercicio = new Ejercicio4();
		List <String> lista = new ArrayList<>();
		lista.add("Hola");
		System.out.println(verificarPalabraEspecifica(lista));
	}

}
