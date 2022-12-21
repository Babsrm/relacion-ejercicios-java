package relacionEjercicios3;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		// Algoritmo que pida un número natural y determine si es primo o no.
		System.out.println("El algoritmo indicará si el número introducido por el usuario es primo o no lo es.");
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		int contador = 0;
		
		for (int i=2; i<=num && contador<2; i++) {
			if ( (num%i)==0 ) {
				contador = contador+1;
			} 
			
		}
		if (contador >= 2) {
			System.out.println("El número NO es primo.");
		} else {
			System.out.println("El número es primo.");
		}
		teclado.close();
	}

}
