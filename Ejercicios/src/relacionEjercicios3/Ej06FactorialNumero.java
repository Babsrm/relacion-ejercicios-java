package relacionEjercicios3;

import java.util.Scanner;

public class Ej06FactorialNumero {

	public static void main(String[] args) {
		// Algoritmo que calcule el factorial de un número entero introducido por el usuario.
		System.out.println("El algoritmo calculará el factorial de un número entero indicado por el usuario.\n"
				+ "Introduzca un número: ");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		
		while (num<0) {
			System.err.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número positivo.");
			num = teclado.nextInt();}
		long resultado = 1;
		
		for ( int i=1 ; i <= num; i++) {
			resultado = i * resultado;
			if (resultado<0) {
				System.err.println("El factorial tiene tantos dígitos que no se puede calcular.");
				teclado.close();
				System.exit(0);
			}
			} 
		System.out.printf("El factorial de %d es %d.", num, resultado);
		teclado.close();
	}
}
