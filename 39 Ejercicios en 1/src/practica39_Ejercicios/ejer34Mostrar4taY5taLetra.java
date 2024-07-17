package practica39_Ejercicios;

import java.util.Scanner;

public class ejer34Mostrar4taY5taLetra {
	 public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        System.out.print("Escribe una palabra: ");
	        String palab1 = leer.nextLine();
	        
	        String palab2 = palab1.substring(3,5);
	        System.out.print("Palabra: "+palab1);
	        System.out.println("la 4ta y 5ta etra es: "+palab2);
	        leer.close();
	        	
	    }
}
