package relacionEjerciciosCadenas;

import java.util.Scanner;

public class Ej01CadenaEmpiezaPor {

	public static void main(String[] args) {
		// Pedir al usuario una cadena y decir si empieza por el carácter ‘H’
		System.out.println("El usuario introducirá una cadena de caracteres; el programa resolverá si ésta empieza por una letra introducida por el usuario.");
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la cadena de caracteres: ");
		String cadena = teclado.nextLine();
		System.out.println("Introduce la letra a comprobar: ");
		String letra = teclado.next();

		if (cadena.charAt(0) == letra.charAt(0)) {
			System.out.println("La palabra empieza por " + letra);
		} else {
			System.err.println("La palabra no empieza por " + letra);
		}
		teclado.close();
	} 

}
