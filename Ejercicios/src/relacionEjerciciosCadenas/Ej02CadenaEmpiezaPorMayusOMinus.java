package relacionEjerciciosCadenas;

import java.util.Scanner;

public class Ej02CadenaEmpiezaPorMayusOMinus {

	public static void main(String[] args) {
		// Pedir al usuario una cadena y decir si empieza por un caracter, sin importar las mayúsculas o minúsculas
		System.out.println("El usuario introducirá una cadena de caracteres; el programa resolverá si ésta empieza por una letra introducida por el usuario");
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la cadena de caracteres: ");
		String cadena = teclado.nextLine();
		System.out.println("Introduce la letra a comprobar: ");
		char letra = teclado.next().charAt(0);

		if (cadena.toUpperCase().charAt(0) == Character.toUpperCase(letra)) {
			System.out.println("La palabra empieza por " + letra);
		} else {
			System.err.println("La palabra no empieza por " + letra);
		}
		
		teclado.close();
	}

}
