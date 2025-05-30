package Clase1Diccionarios;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> departamentos = List.of(
        		 "Artigas",
                 "Canelones",
                 "Cerro Largo",
                 "Colonia",
                 "Durazno",
                 "Flores",
                 "Florida",
                 "Lavalleja",
                 "Maldonado",
                 "Montevideo",
                 "Paysandú",
                 "Río Negro",
                 "Rivera",
                 "Rocha",
                 "Salto",
                 "San José",
                 "Soriano",
                 "Tacuarembó",
                 "Treinta y Tres"
        );
        List <Integer> poblacion = List.of(
        						  73917, 520187, 83961, 177574, 57111, 25498, 68715, 
				  57617, 164300, 1386883, 113124, 54588, 103493, 
				  58878, 124611, 108309, 83032, 91080, 56579
		);

        // LinkedHashMap mantiene el orden de inserción
        Map<String, Integer> diccionario = new LinkedHashMap<>();
        for (int i = 0; i < departamentos.size(); i++) {
            diccionario.put(departamentos.get(i), poblacion.get(i));
        }

        // Imprimir en orden
        for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
        	String clave = entry.getKey();
        	Integer valor = entry.getValue();
            System.out.println("Departamento: " + clave + ", Poblacion: " + valor);
        }
    }
}
