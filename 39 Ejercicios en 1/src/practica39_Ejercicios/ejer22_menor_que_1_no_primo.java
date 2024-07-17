package practica39_Ejercicios;

import java.util.Scanner;

public class ejer22_menor_que_1_no_primo {
	public static void main(String [] args){
		Scanner leer = new Scanner (System.in);
		int a=0;
		int b=2;
		boolean verifi = true;
		System.out.println("Ingrese el número a verificar");
		a = leer.nextInt();
		leer.close();

		while((verifi) && (b < a)){
			if(((a % b) == 0)) {
				verifi=false;
			}else {
				b=b+1;
			}
		}
		if(verifi==true) {
			if(a<=1){
				System.out.println("El numero no es Primo");
			}else{
				System.out.println("El numero es Primo");
			}
		}else {
			System.out.println("El numero es NO Primo");
		}
	}
}
