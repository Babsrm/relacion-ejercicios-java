package relacionEjercicios3;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		// Algoritmo que escriba los números impares comprendidos entre dos enteros introducidos por el usuario
		System.out.println("A continuación, el algoritmo escribirá todos los números impares comprendidos entre dos números introducidos por el usuario.");
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Escriba el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Escriba el segundo número: ");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			int variable;
			variable = num2;
			num2 = num1;
			num1 = variable;
		}
		
//		for ( ; num1<=num2; num1++) {
//			if ( (num1%2) == 0) {
//				continue;
//			}
//			System.out.println(num1);
//		}
		for ( ; num1<=num2; num1++) {
			if ( (num1%2) != 0) {
				System.out.println(num1);
			}
			
		}
		teclado.close();
	}
}
