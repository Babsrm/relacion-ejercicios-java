package relacionEjercicios3;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		// Algoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido entre uno y diez, introducido por el usuario, usando un esquema do while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante un esquema do-while, que el número está comprendido entre 1 y 10.
		System.out.println("El usuario indicará un número comprendido entre 1 y 10; la máquina mostrará la tabla de multiplicar de dicho número.");
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int i = 0;
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		
		while (num<0 || num>10) {
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10.");
			num = teclado.nextInt();
		}
		do {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			i++;
		} while (i<=10);
		teclado.close();
		}
	}
