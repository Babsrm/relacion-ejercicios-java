package relacionEjercicios3;

import java.util.Scanner;

public class Ej01TablaMultiplicarFor {

	public static void main(String[] args) {
		// . Algoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido entre uno y diez, introducido por el usuario, usando un esquema for. 
		System.out.println("El usuario indicará un número comprendido entre 1 y 10; la máquina mostrará la tabla de multiplicar de dicho número.");
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		
		if (num>0 && num<=10) {
				for (int i=0 ; i<=10 ; i++){
					System.out.printf("%d x %d = %d\n", num, i, num*i);
				}
		} else {
			System.out.println("Número introducido no válido.");
		}
			teclado.close();
	}

}
