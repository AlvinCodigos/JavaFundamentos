package practica39_Ejercicios;

import java.util.Scanner;

public class ejer27For_SumaNumeros {
	public static void main(String[] args) {
		int a = 0;
		int cont = 0, sum=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el un numero mayor a uno");
		a = leer.nextInt();
		leer.close();
		for (int i=1;i<=a;i++){
			sum=i+a;
			System.out.println(i+") "+a+" + "+i+" = "+sum);
			cont=cont++;
        }
	}
}
