package practica39_Ejercicios;

public class ejer19_1 {
	public static void main (String[] args) {
		String cade1 = "hola";
		String cade2 = "Juan";
		String cade3 = " ";
		
		cade3="Como estas ".concat(cade2);
		
		System.out.println("cade3:" + cade3);
		
		System.out.println("Tamaño de la cadena es:" + cade3.length());
		
		System.out.println("Subcadena: " + cade3.substring(0,5));
		
		System.out.println("MAyusculas:" + cade3.toUpperCase());
	}

}

