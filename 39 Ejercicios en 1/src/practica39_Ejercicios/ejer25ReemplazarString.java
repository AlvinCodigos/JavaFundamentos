package practica39_Ejercicios;

public class ejer25ReemplazarString {
	public static void main(String[] args) {

		String myString = "La lluvia en Sevilla es una maravilla";
		System.out.println("Original texto: \t\t\t" + myString);

		char oldCharacter = 'a'; 
		char newCharacter = 'e'; 
          String updatedString = myString.replace(oldCharacter, newCharacter);
		System.out.println("Texto con vocal modificado'" + oldCharacter + "' a '" +
		newCharacter + "': \t\t" + updatedString);
	}
}
