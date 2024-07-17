package practica39_Ejercicios;

import java.util.Scanner;

public class ejer30FraseInfinitaHastaEspacio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringBuilder cadenaResultante = new StringBuilder();

        while (true) {
            System.out.print("Escribe una frase (o presiona Enter para salir): ");
            String frase = leer.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            cadenaResultante.append(frase).append(" ");
        }
        leer.close();
        System.out.println("La cadena resultante es: " + cadenaResultante.toString());
    }
}
