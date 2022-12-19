package relacionEjercicios2;

import java.util.Scanner;

public class ej07AnioBisiestoONo {
	public static void main(String[] args) {
		// Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta que son años bisiestos los múltiplos de 4, excepto los que son también múltiplos de 100 pero no lo son de 400.
		System.out.println("El usuario indica un año aleatorio, el algoritmo responde si es bisiesto o no.");
		
		Scanner teclado = new Scanner(System.in);
		int ano;
		
		System.out.println("Introduzca el año a comprobar: ");
		ano = teclado.nextInt();
		
		if (ano%4 != 0) {
			System.out.printf("El año %d no es bisiesto.\n", ano);
		} else if ((ano%100 == 0) && (ano%400 != 0)) {
			System.out.printf("El año %d no es bisiesto.\n", ano);
		} else { 
			System.out.printf("El año %d es bisiesto.", ano);
		}
		teclado.close();
	}

}
