package practica39_Ejercicios;

import java.util.Scanner;

public class ejer37GetMesConToString {
	public static void main(String[] args) {
        int finDeMes = getFinDeMes();
        String mes = adivinaMes(finDeMes);
        System.out.println("El mes es: " + mes);
    }

    public static int getFinDeMes() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el fin de mes (1-31): ");
        int finDeMes = leer.nextInt();
        leer.close();
        return finDeMes;
    }

    public static String adivinaMes(int finDeMes) {
        String mes = "";
        switch (finDeMes) {
            case 28:
            case 29:
                mes = "Febrero";
                break;
            case 30:
                mes = "Abril, Junio, Septiembre o Noviembre";
                break;
            case 31:
                mes = "Enero, Marzo, Mayo, Julio, Agosto, Octubre o Diciembre";
                break;
            default:
                mes = "Mes no válido";
        }
        return mes;
    }
}
