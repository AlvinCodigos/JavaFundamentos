package practica39_Ejercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ejer39RelogDijitalSinParar {
	public static void main(String[] args) {
        while (true) {
            LocalTime horaActual = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaFormateada = horaActual.format(formatter);
            System.out.println("\r" + horaFormateada);
            try {
                Thread.sleep(1000); // espera 1 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
