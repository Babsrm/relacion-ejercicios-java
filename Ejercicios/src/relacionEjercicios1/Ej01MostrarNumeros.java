package relacionEjercicios1;

import java.util.Scanner;

public class Ej01MostrarNumeros {

	public static void main(String[] args) {
		// 1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca un número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduzca un segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.println("Los números introducidos son: " +num1 +" y " +num2 +".");
		System.out.printf("Los números introducidos son: %d y %d.\n", num1, num2);
		
		teclado.close();
		}


}