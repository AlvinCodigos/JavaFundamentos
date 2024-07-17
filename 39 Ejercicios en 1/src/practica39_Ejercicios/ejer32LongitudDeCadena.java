package practica39_Ejercicios;

import java.util.Scanner;

public class ejer32LongitudDeCadena {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe una cadena: ");
        String cadena = leer.nextLine();

        int longitud = cadena.length();
        leer.close();
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}
