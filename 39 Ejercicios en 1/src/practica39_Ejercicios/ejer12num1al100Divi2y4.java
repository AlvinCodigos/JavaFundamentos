package practica39_Ejercicios;

public class ejer12num1al100Divi2y4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100 ; i++) {
			if ((i % 2 == 0 && i % 3 == 0) || i == 1 || i == 100) {
				System.out.println(i);
			}
		}
	}
}
