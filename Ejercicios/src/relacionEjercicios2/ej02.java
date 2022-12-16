package relacionEjercicios2;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		//  Algoritmo que pida 3 números e indique cual es el menor de los tres.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Se le solicitan 3 números diferentes al usuario. La máquina responderá cuál es el menor de los 3.");
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduzca el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduzca el tercer y último número: ");
		num3 = teclado.nextInt();
		
		if ( (num1 < num2) & (num2 < num3) ) {
			System.out.printf("El número %d es el menor de los 3.", num1);
		} else if ( (num2 < num1) & (num2 < num3) ) {
			System.out.printf("El número %d es el menor de los 3.", num2);
		} else if ( (num3 < num1) & (num3 < num2) ) {
			System.out.printf("El número %d es el menor de los 3.", num3);
		} else {
			System.out.println("Los tres números son iguales.");
		}

		teclado.close();
	}

}
