package Divide_Y_Venceras;

public class Ejercicio3 {

	   // Método recursivo que imprime todas las permutaciones de 'original' concatenadas a 'parcial'
    public static void permutar(String original, String parcial) {
        if (original.length() == 0) {
            System.out.println(parcial);
        } else {
            for (int i = 0; i < original.length(); i++) {
                // Divide: separa el caracter actual y el resto de la cadena
                char c = original.charAt(i);
                String restante = original.substring(0, i) + original.substring(i + 1);
                // Vencerás: resuelve recursivamente la permutación del resto, añadiendo el caracter a 'parcial'
                permutar(restante, parcial + c);
            }
        }
    }
	
	public static void main(String[] args) {
	    String s = "abc"; // Ejemplo: permutaciones de "abc"
        permutar(s, "");
	}

}
