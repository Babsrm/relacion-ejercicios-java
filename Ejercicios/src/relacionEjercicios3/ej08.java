package relacionEjercicios3;

import java.util.Random;
import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		// Programa que pide un número del 1 al 10 hasta que el usuario acierte el número definido en el programa
		System.out.println("El usuario ha de adivinar el número que tiene definido el programa.\n"
				+ "Introduzca un número: ");
		Scanner teclado = new Scanner(System.in);
		int num, aleatorio;
		num = teclado.nextInt();
		Random generadorAleatorio = new Random();
	//	aleatorio = generadorAleatorio.nextInt(10) + 1; //al decir que nextint(10) me genera un num entre 0 y 9. y a cualquiera que salga le estoy sumando 1 por lo que el rango se me queda entre 1 y 10.
		aleatorio = generadorAleatorio.nextInt(1, 10); // este ya nos deja elegir el rango directamente
		
		while (num<0 || num>10) {
			System.err.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10.");
			num = teclado.nextInt();
		}
		
		while ( num != aleatorio) {
			System.err.println("El número introducido no es correcto!");
			System.out.println("Inténtalo de nuevo: ");
			num = teclado.nextInt();
		}
		if (num == aleatorio) {
			System.out.printf("Has acertado! El número era %d.", aleatorio);
		} 
		teclado.close();
	}

}
