package practica39_Ejercicios;

import java.util.Scanner;

public class ejer36DiaDeLaSemanaMain {
	public static void main(String[] args) {
        System.out.print("Ingrese un día de la semana (LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO): ");
        Scanner leer = new Scanner(System.in);
        String dia = leer.nextLine();
        leer.close();
        //El método valueOf de String devuelve el valor primitivo de un objeto String como un tipo de dato cadena. 
        DiaSemana diaSemana = DiaSemana.valueOf(dia.toUpperCase());

        if (diaSemana.isEsLaboral()) {
            System.out.println("El día " + diaSemana + " es laboral.");
        } else {
            System.out.println("El día " + diaSemana + " no es laboral.");
        }
    }
	public enum DiaSemana {
	    LUNES(true), MARTES(true), MIERCOLES(true), JUEVES(true), VIERNES(true), SABADO(false), DOMINGO(false);

	    private boolean esLaboral;

	    DiaSemana(boolean esLaboral) {
	        this.esLaboral = esLaboral;
	    }

	    public boolean isEsLaboral() {
	        return esLaboral;
	    }
	}
}
