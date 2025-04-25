package workbox;

public class Ejercicio2 {

	
	public static Nodo clonarLista(Nodo nodo) {
		Nodo retorno = new Nodo();
		Nodo aux = nodo;
		
		while(aux != null) {
			retorno.setValor(aux.getValor());
			retorno.setSiguiente(aux.getSiguiente());;
			aux = aux.getSiguiente();
		}
		return retorno;
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
		
		System.out.println(clonarLista(nodo1));
	}

}
