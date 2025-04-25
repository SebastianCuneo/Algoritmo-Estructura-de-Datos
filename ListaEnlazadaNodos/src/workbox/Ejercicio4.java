package workbox;

public class Ejercicio4 {

	
    public static int sumaPosicionesPares(Nodo nodo) {
        int suma = 0;
        int indice = 0;
        Nodo aux = nodo;
        while (aux != null) {
            if (indice % 2 == 0) {
                suma += aux.getValor();
            }
            indice++;
            aux = aux.getSiguiente();
        }
        return suma;
    }

    public static void main(String[] args) {
    	//posicion 0
        Nodo nodo1 = new Nodo();
        nodo1.setValor(3);

        //posicion 1
        Nodo nodo2 = new Nodo();
        nodo2.setValor(4);
        nodo1.setSiguiente(nodo2);

        //posicion 2
        Nodo nodo3 = new Nodo();
        nodo3.setValor(2);
        nodo2.setSiguiente(nodo3);
        //posicion 3
        Nodo nodo4 = new Nodo();
        nodo4.setValor(2);
        nodo3.setSiguiente(nodo4);
        //posicion 4
        Nodo nodo5 = new Nodo();
        nodo5.setValor(2);
        nodo4.setSiguiente(nodo5);

        // Llamar al método corregido
        System.out.println(sumaPosicionesPares(nodo1));  // Imprimirá 3 + 2 = 5
    }
}
