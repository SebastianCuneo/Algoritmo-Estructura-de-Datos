package workbox;

public class Ejercicio1 {
	
	
	public static int contarPares(Nodo nodo) {
		
		int contador = 0;
		Nodo aux = nodo;
		while(aux != null) {
			if(aux.getValor()%2==0) {
				contador ++;
			}
			aux = aux.getSiguiente();
		}
		return contador;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo nodo1= new Nodo();
		nodo1.setValor(3);
	
		Nodo nodo2 = new Nodo();
		nodo2.setValor(4);
		nodo1.setSiguiente(nodo2);
		
		Nodo nodo3 = new Nodo();
		nodo3.setValor(2);
		nodo2.setSiguiente(nodo3);
		
		System.out.println(contarPares(nodo1)); 
		
	}

	

	
}
