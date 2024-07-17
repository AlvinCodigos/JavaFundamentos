package practica39_Ejercicios;

import java.util.Scanner;

public class ejer29EliminarEspacios {
	  public static void main(String[] args) {
		    Scanner leer = new Scanner(System.in);

		    System.out.print("Ingrese una frase: ");
		    String frase = leer.nextLine();
		    leer.close();		    
		    String fraseSinEspacios = frase.replace(" ", "");

		    System.out.println("La frase sin espacios es: " + fraseSinEspacios);
		  }
}
