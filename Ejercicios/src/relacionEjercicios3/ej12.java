package relacionEjercicios3;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas do while.
		System.out.println("Se le pide al usuario un número entre 1 y 10; el algoritmo devuelve la tabla de multiplicar.");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num = teclado.nextInt();
		
		while (num<0 || num>10) {
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10.");
			num = teclado.nextInt();}
		
		int i = 1;
		
		do {
			System.out.printf("%d x %d = %d.\n", i, num, i*num);
			i++;
		} while ( i<=10 );
		teclado.close();
	}

}
