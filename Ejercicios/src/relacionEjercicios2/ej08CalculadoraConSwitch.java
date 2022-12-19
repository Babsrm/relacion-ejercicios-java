package relacionEjercicios2;

import java.util.Scanner;

public class ej08CalculadoraConSwitch {

	public static void main(String[] args) {
		// Escribir un programa que implemente una pequeña calculadora con switch-case. El programa pedirá al usuario los operandos (a y b) y la operación a realizar: suma, resta, multiplicación, división, raíz cuadrada del primer número y elevar el primer número al segundo. En función de la opción seleccionada se realizará una de las operaciones aritméticas.
		System.out.println("Este programa es una pequeña y simple calculadora. Trabaja con números reales.\n"
				+ "Primero se le van a pedir los números con los que va a trabajar. Son dos en total. Después, por último, se le pide un dígito control que indica el código de la operación que el usuario desea realizar.\n"
				+ "Los códigos de las operaciones aritméticas son los siguientes:\n"
				+ "1. Suma\n"
				+ "2. Resta\n"
				+ "3. Multiplicación\n"
				+ "4. División\n"
				+ "5. Raíz Cuadrada (solo la hace del primer número introducido\n"
				+ "6. Exponente del primer número por el segundo.\n");
		Scanner teclado = new Scanner(System.in);
		
		double num1, num2, res;
		int num_cod;
		
		System.out.println("Introduzca el primer valor: ");
		num1 = teclado.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		num2 = teclado.nextDouble();
		System.out.println("Introduzca el código de la operación a realizar.");
		num_cod = teclado.nextInt();
		
		
		switch (num_cod) {
			case 1:
				System.out.printf("La suma de %.2f y %.2f es %.2f.\n", num1, num2, num1+num2);
				break;
			case 2:
				res = num1 - num2;
				System.out.printf("La resta de %.2f y %.2f es %.2f.\n", num1, num2, res);
				break;
			case 3: 
				res = num1 * num2;
				System.out.printf("La multiplicación de %.2f y %.2f es %.2f.\n", num1, num2, res);
				break;
			case 4: 
				res = num1 / num2;
				System.out.printf("La división entre %.2f y %.2f es %.2f.\n", num1, num2, res);
				break;
			case 5: 
				res = Math.sqrt(num1);
				System.out.printf("La raíz cuadrada de %.2f es %.2f.\n", num1, res);
				break;
			case 6: 
				res = Math.pow(num1, num2);
				System.out.printf("El exponente de %.2f elevado a %.2f es %.2f.\n", num1, num2, res);
				break;
			default:
				System.out.println("Elija un código de operación válido.");
		}
		teclado.close();
	}

}
