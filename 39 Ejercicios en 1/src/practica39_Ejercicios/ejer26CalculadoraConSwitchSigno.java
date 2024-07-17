package practica39_Ejercicios;

import java.util.Scanner;

public class ejer26CalculadoraConSwitchSigno {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int resul = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		a = leer.nextInt();
		System.out.println("Ingrese el segundo valor");
		b = leer.nextInt();
		System.out.println("Ingrese la operacion (+ - * / %)");
		char operacion = leer.next().charAt(0);
		leer.close();
		switch (operacion) {
        case '+':
            resul=(a+b);
            break;
        case '-':
            resul=a-b;
            break;
        case '*':
        	resul=a*b;
            break;
        case '/':
        	resul=a/b;
            break;
        case '%':
        	resul=a%b;
            break;
        default:
            break;
    }
		System.out.println("la operacion es: " +a+" "+operacion+" "+b);
		System.out.println("el resultado es: " + (resul));

		
	}
}
