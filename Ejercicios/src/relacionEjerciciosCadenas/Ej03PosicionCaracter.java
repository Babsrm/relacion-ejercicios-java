package relacionEjerciciosCadenas;

import java.util.Scanner;

public class Ej03PosicionCaracter {

	public static void main(String[] args) {
		// Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, o indicar que no está si procede. No se puede usar indexOf o similar
		System.out.println("El usuario introducirá una cadena de caracteres y un carácter; el programa resolverá en qué posición está ese carácter.");
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la cadena de caracteres: ");
		String cadena = teclado.nextLine();
		System.out.println("Introduce la letra a buscar: ");
		char letra = teclado.next().charAt(0);
		int posicion = -1; //es un valor predefinido que no es posible. si no existe, no variará y podré dar el error correctamente

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.toLowerCase().charAt(i) == Character.toLowerCase(letra)) {
				posicion = i;
				System.out.println("Encontrada letra " + letra +" en la posición " +i +".");
			}
		}
		
		if (posicion == -1) {
			System.out.println("No se ha encontrado el carácter.");
		}
		
		teclado.close();
	}

}
