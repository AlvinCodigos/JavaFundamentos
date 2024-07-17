package practica39_Ejercicios;

import java.util.Scanner;

public class ejer16AciertoDeContraseña {
	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	String contra ="ALVIN324";
	String a;
	int intent=0;
	
		while(intent<=3) {
			
			if(intent<3) {
				 System.out.println("Introduce la contraseña");
				 a =leer.nextLine();
					if (a.equals(contra)) {
						System.out.println("En hora buena mi King");
						break;
					}
			}
			intent++;
			if(intent==3) {
				System.out.println("Se acabaron tus intentos papu");
			}
		}
		leer.close();
	}
}


