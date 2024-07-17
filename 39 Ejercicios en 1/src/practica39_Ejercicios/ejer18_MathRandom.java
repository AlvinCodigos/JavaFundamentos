package practica39_Ejercicios;
import java.util.Scanner;
public class ejer18_MathRandom {
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el  primer valor");
		int num1 = leer.nextInt();
		leer.close();
		System.out.println("Ingresa el  segundo valor");
		int num2 = leer.nextInt();
		
		for(int i=0;i<10;i++) {
			int numAlea = (int)Math.floor(Math.random()*(num1-num2)+num2);
			System.out.println(numAlea);
		}
	}
}
