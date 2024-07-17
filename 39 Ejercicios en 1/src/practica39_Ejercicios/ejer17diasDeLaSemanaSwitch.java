package practica39_Ejercicios;

import java.util.Scanner;

public class ejer17diasDeLaSemanaSwitch {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int a;
		a =leer.nextInt();
		leer.close();
		switch (a) {
		case 1:
			System.out.println("lUNES, Es un Dia LABORAL");
			break;
		case 2:
			System.out.println("MARTES, Es un Dia LABORAL");
			break;
		case 3:
			System.out.println("MIÉRCOLES, Es un Dia LABORAL");
			break;
		case 4:
			System.out.println("JUEVES, Es un Dia LABORAL");
			break;
		case 5:
			System.out.println("VIERNES, Es un Dia LABORAL");
			break;
		case 6:
			System.out.println("SÁBADO, NO es un Dia LABORAL");
			break;
		case 7:
			System.out.println("DOMINGO ES, NO es un Dia LABORAL");
			break;
		default: System.out.println("NO EXISTE PAPU");
			
			
		}			
		}
}
