package Ejercicios_Queue;
import java.util.LinkedList;
import java.util.Queue;
public class Ejercicio4 {
	
	
	public static void colaPacientes(Queue<String> cola) {
		cola.offer("Seba");
		cola.offer("Seba");
		cola.offer("Juean");
		int largo = cola.size();

		System.out.println("Pacientes en cola de espera: " + cola);
		for( int i = 0; i < largo; i++) {
			System.out.println("Turno de " + cola.poll());
		}
		cola.add("pedro");
		System.out.println("Nuevo cliente en cola: "  + cola.peek());
		System.out.println("Pacientes en cola de espera: " + cola);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> cola = new LinkedList<>();
		colaPacientes(cola)	;
	}

}
