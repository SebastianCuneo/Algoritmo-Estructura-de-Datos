package Ejercicios_Queue;
import java.util.Queue;
import java.util.LinkedList;
public class Ejercicio5 {

	public static int calcularPromedio(Queue<Integer>cola) {
		int contador = 0;
		int suma = 0;
		int promedio = 0;
		for(Integer valor : cola) {
			suma += valor;
			contador ++;
		}
		promedio = suma / contador;
		System.out.println("cola: " + cola);
		return promedio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> cola = new LinkedList<>();
		cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);
        System.out.println( calcularPromedio(cola));
       
	}

}
