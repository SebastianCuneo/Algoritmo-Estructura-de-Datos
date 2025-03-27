package ultimateJava;
import java.util.Arrays;
import java.util.Scanner;

public class UltimateJ {
	
	
	public int Calculadora(int num1, int num2, int tipo) {
		if(tipo == 1) {
			
		}
		return 0;
		
	}

	public static void main(String[] args) {

		Scanner lectura = new Scanner (System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre = lectura.next();
		
		//Crear array 
		int [] arrNumeros = {1, 2, 3, 4, 10};
		String [] nombres = {"Seba", "julian", "pepe", "pedro"};
		arrNumeros[0] = 5; 
		arrNumeros[1] = 2;
		for(int i = 0; i < nombres.length; i ++) {
			System.out.println(i + " " + nombres[i]);	
		}
		
		System.out.println(Arrays.toString(arrNumeros));
		Arrays.sort(arrNumeros);
		System.out.println(arrNumeros.length);
		System.out.println(Arrays.toString(arrNumeros));
		
	}

}
