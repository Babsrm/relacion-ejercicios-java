package relacionEjercicios3;

import java.util.Scanner;

public class Ej02TablaMultiplicarWhile {

	public static void main(String[] args) {
		// Algoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido entre uno y diez, introducido por el usuario, usando un esquema while
		
		System.out.println("El usuario indicará un número comprendido entre 1 y 10; la máquina mostrará la tabla de multiplicar de dicho número.");
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int i = 0;
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		
		if (num>0 && num<=10) {
			while ( i <= 10 ) {
				System.out.printf("	%d x %d = %d\n", num, i, num*i);
				i++;}
			} else {
				System.out.println("Número introducido no válido.");
			}
			teclado.close();	
	}
	}
