package practica39_Ejercicios;

import java.util.Scanner;

public class ejer7 {
	public static void maim(String[] args){
		Scanner leer = new Scanner(System.in);
		System.out.println("ingresa el  valor ASCII");
		int valor = leer.next().charAt(0);
		leer.close();
		char caracter = (char)valor;
		
		System.out.println(caracter);
	}
}
