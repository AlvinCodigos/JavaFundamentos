package practica39_Ejercicios;

import java.util.Scanner;

public class ejer28ContarNumerosHataMenos1 {
	  public static void main(String[] args) {
		    Scanner leer = new Scanner(System.in);
		    int contador = 0;
		    int numero;

		    System.out.println("Ingrese números (ingrese -1 para finalizar):");

		    while (true) {
		      numero = leer.nextInt();
		      
		      if (numero == -1) {
		        break;
		      }
		      contador++;
		    }

		    leer.close();
		    System.out.println("Se han introducido " + contador + " números.");
		  }
}
