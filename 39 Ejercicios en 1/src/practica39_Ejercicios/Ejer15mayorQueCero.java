package practica39_Ejercicios;

import java.util.Scanner;

public class Ejer15mayorQueCero {
	public static void main(String[] args) {
		/*Declarar la variable
		 * 
		 */
		int num;
		 Scanner leer =  new Scanner(System.in);
		 do {
			 System.out.println("Introduce el  valor");
			 num =leer.nextInt();
		 }while(num>=0);
		 System.out.println(num);
		leer.close(); 
	}

}

