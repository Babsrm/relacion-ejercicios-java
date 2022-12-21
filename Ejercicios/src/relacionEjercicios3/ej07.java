package relacionEjercicios3;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		// Algoritmo que cuente cuántos múltiplos de 7 hay entre dos enteros dados por
		// el usuario.
		System.out.println("El algoritmo contará los múltiplos de 7 que hay entre dos enteros que indica el usuario.\n"
				+ "Indique el primer número: ");
		Scanner teclado = new Scanner(System.in);
		long num1, num2;
		num1 = teclado.nextInt();
		System.out.println("Indique el segundo número: ");
		num2 = teclado.nextInt();

		if (num1 > num2) {
			long variable;
			variable = num2;
			num2 = num1;
			num1 = variable;
		}
		int contador = 0;

		for (; num1 <= num2; num1++) {
			if ((num1 % 7) == 0) {
				System.out.println(num1);
				contador++;
			}			
		}
//		while (num1%7 != 0) {   aqui simplificamos: buscamos el primer divisible entre 7
//			num1++;   es decir, se va incrementando num1 hasta que el resto sea 0. cuando sea cero, entra al siguiente
//		}
//		while (num1 <= num2) { aqui se le suma al contador y suma 7 a num1 para conseguir el siguiente múltiplo
//			contador ++;		hasta que el num1 = num2
//			num1 = num1+7;
//		}
		teclado.close();
		System.out.printf("El número de múltiplos de 7 que hay son un total de: %d.", contador);
	}

}
