package workbox;

public class Ejercicio3 {

	public static Nodo invertir(Nodo nodo) {
		Nodo retorno = new Nodo();
		Nodo prev = null;
		Nodo current  = nodo;
		
		while(current != null) {
	           Nodo next = current.getSiguiente();  // guarda siguiente
	           current.setSiguiente(prev);          // invierte puntero
	           prev = current;                      // avanza prev
	           current = next;                      // avanza current
	        }
	        return prev;  // prev es la nueva cabeza
	}
	
	  // Recorre y muestra todos los nodos
    private static void imprimirLista(Nodo nodo) {
        Nodo aux = nodo;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println();
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
		
		Nodo invertido = invertir(nodo1);
		imprimirLista(invertido);
	}

}
