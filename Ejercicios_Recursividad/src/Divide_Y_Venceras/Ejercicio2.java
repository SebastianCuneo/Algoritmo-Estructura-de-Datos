package Divide_Y_Venceras;

public class Ejercicio2 {

    public static int sumaDigitosBinarios(String binary) {
        if (binary.length() == 1) {
            // Caso base: si la cadena tiene un solo dígito, se convierte a int y se retorna
            return binary.charAt(0) - '0'; // Convertir '0' o '1' a 0 o 1
        }

        // Dividir la cadena en dos mitades
        int mid = binary.length() / 2;
        String left = binary.substring(0, mid); // Parte izquierda
        String right = binary.substring(mid);  // Parte derecha

        // Recursivamente calcular la suma de los dígitos en ambas mitades
        return sumaDigitosBinarios(left) + sumaDigitosBinarios(right);
    }

    
	public static void main(String[] args) {
		
		   String binary = "1100101"; // Número binario como cadena
	        int result = sumaDigitosBinarios(binary); // Llamada al método recursivo
	        System.out.println("La suma de los dígitos binarios es: " + result); // Resultado

	}

}
