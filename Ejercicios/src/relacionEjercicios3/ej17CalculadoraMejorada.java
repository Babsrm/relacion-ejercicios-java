package relacionEjercicios3;

import java.util.Scanner;

public class ej17CalculadoraMejorada {

	public static void main(String[] args) {
		// Implementar el ejercicio 8 (calculadora) de la práctica 2, introduciendo un
		// esquema do-while, de forma que el usuario decida cuando quiere salir del
		// programa.
		System.out.println("Este programa es una pequeña y simple calculadora. Trabaja con números reales.\n"
				+ "Primero se le van a pedir los números con los que va a trabajar. Después, por último, se le pide un dígito control que indica el código de la operación que el usuario desea realizar.\n"
				+ "Los códigos de las operaciones aritméticas son los siguientes:\n" 
				+ "1. Suma\n" 
				+ "2. Resta\n"
				+ "3. Multiplicación\n"
				+ "4. División\n"
				+ "5. Raíz Cuadrada\n"
				+ "6. Exponente del primer número por el segundo.\n"
				+ "0. Salir del programa.\n");
		Scanner teclado = new Scanner(System.in);

		double num1=0, num2=0, res;
		int num_cod;
		do {
			System.out.println("Introduzca el código de la operación a realizar.");
			num_cod = teclado.nextInt();
			if (num_cod>=1 && num_cod<=6) { //si el cod no es el de salida, pide valor primero
				System.out.println("Introduzca el primer valor: ");
				num1 = teclado.nextDouble();
				if (num_cod!=5) { //pero si es diferente a la raiz cuadrada, es cuando pide el segundo valor
					System.out.println("Introduzca el segundo valor: ");
					num2 = teclado.nextDouble();
				}
			}
		
			switch (num_cod) {

			case 0:
				System.out.println("Hasta luego!");
				System.exit(0);
			case 1:
				System.out.printf("%.2f + %.2f = %.2f.\n", num1, num2, num1 + num2);
				break;
			case 2:
				res = num1 - num2;
				System.out.printf("%.2f - %.2f = %.2f.\n", num1, num2, res);
				break;
			case 3:
				res = num1 * num2;
				System.out.printf("%.2f x %.2f = %.2f.\n", num1, num2, res);
				break;
			case 4:
				res = num1 / num2;
				System.out.printf("%.2f / %.2f = %.2f.\n", num1, num2, res);
				break;
			case 5:
				res = Math.sqrt(num1);
				System.out.printf("La raíz cuadrada de %.2f es %.2f.\n", num1, res);
				break;
			case 6:
				res = Math.pow(num1, num2);
				System.out.printf("%.2f ^ %.2f = %.2f.\n", num1, num2, res);
				break;

			default:
				System.err.println("Elija un código de operación válido.");
			}
		} while (num_cod != 0);
		teclado.close();
	}

}
