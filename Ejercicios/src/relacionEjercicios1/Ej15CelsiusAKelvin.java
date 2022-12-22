package relacionEjercicios1;

import java.util.Scanner;

public class Ej15CelsiusAKelvin {

	public static void main(String[] args) {
		// Programa para pasar de grados centígrados a grados Kelvin
		Scanner teclado = new Scanner(System.in);
		
		double num;
		
		System.out.println("Introduzca los grados celsius: ");
		num = teclado.nextDouble();
		
		double resultado = 273.15 + num;
		
		System.out.printf("%.2f grados celsius equivalen a %.2f Kelvin.", num, resultado);
		teclado.close();
	}

}
