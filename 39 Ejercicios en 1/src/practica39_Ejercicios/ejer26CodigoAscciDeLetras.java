package practica39_Ejercicios;

public class ejer26CodigoAscciDeLetras {
    public static void main(String[] args) {
        String cadena = "hola";
        for (char c : cadena.toCharArray()) {
            System.out.print((int) c + " ");
        }
    }
}
