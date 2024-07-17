package practica39_Ejercicios;

import java.util.Scanner;

public class ejer31ConvertirMayusMinus {
	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = leer.nextLine();

        System.out.print("¿Quieres convertir la frase a mayúsculas (M) o minúsculas (m)? ");
        char opcion = leer.next().charAt(0);
        leer.close();
        String fraseConvertida;
        if (opcion == 'M' || opcion == 'm') {
            if (opcion == 'M') {
                fraseConvertida = frase.toUpperCase();
            } else {
                fraseConvertida = frase.toLowerCase();
            }
            System.out.println("La frase convertida es: " + fraseConvertida);
        } else {
            System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }
}
