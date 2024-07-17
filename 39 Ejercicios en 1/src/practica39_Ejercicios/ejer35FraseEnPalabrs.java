package practica39_Ejercicios;

import java.util.Scanner;

public class ejer35FraseEnPalabrs {
	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
    	String frase = leer.nextLine();
    	// [,:] es una expresión regular que coincide con comas o puntos y coma
    	String[] palabras = frase.split("[,:;' ']+"); //Split se usa para dividir una cadena delimitada en subcadenas. 
    	leer.close();
    	for (String palabra : palabras) {
    	    System.out.println(palabra);
	}

	}
}
