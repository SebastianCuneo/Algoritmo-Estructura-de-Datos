package Ejercicios_Stack;
import java.util.Stack;
public class Ejercicio5 {

	public static int contarElementosPila(Stack <String> pila) {
		int contador = 0;
		while(!pila.isEmpty()) {
			pila.pop();
			contador ++;
		}
		return contador;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack <String> pila = new Stack<>();
	pila.push("gola");
	pila.push("tero");
	//pila.push("Gato");
	
	System.out.println(contarElementosPila(pila));
	}


}
