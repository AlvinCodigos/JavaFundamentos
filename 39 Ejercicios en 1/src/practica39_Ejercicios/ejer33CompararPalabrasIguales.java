package practica39_Ejercicios;

import java.util.Scanner;

public class ejer33CompararPalabrasIguales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palab1 = leer.nextLine();
        System.out.print("Escribe otra palabra para comparar: ");
        String palab2 = leer.nextLine();
        leer.close();
        if (palab1.equals(palab2)) {
        	 System.out.println("las palabras son iguales");
        }else {
            System.out.println("las palabras son diferentes");
        }
        	
    }
}
