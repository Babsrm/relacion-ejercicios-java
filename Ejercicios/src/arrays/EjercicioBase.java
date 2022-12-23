package arrays;

import java.util.Scanner;

public class EjercicioBase {

	public static void main(String[] args) {
		
		int numeros[];
		numeros = new int [10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Introduce el %dº numero: ", i+1);
			numeros[i] = teclado.nextInt();
		}
		System.out.println("Tus datos son:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		teclado.close();
	}

}
