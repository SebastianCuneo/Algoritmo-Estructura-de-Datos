package Ejercicios_Queue;
import java.util.LinkedList;
import java.util.Queue;


public class Ejercicio1 {

	public Queue<String> Queue() {
		
		Queue <String> cola = new LinkedList<>();
		for(int i = 0; i < 11; i++) {
			cola.add("Persona " + i);
		}
		System.out.println("Personas de la cola: " + cola);
		return cola;
	}
	
	public void Cajero(Queue<String> cola) {
		int tamanio = cola.size();
		for(int i = 0; i < tamanio; i++) {
			System.out.println("Atendiendo a: " + cola.poll());
		}
		System.out.println("Personas de la cola: " + cola);
		
	}

	public static void main(String[] args) {
	
		Ejercicio1 ejercicio = new Ejercicio1();
		Queue <String> cola  = ejercicio.Queue();
		
		ejercicio.Cajero(cola);

	}

}
