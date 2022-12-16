package relacionEjercicios2;

import java.util.Scanner;

public class ej01 {
public static void main(String[] args) {
	// Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son iguales. 
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("De dos números otorgados por el usuario, vamos a determinar cuál es mayor, cuál menor o si son iguales.");
	int num1;
	int num2;
	
	System.out.println("Introduzca un número: ");
	num1 = teclado.nextInt();
	System.out.println("Introduzca otro número: ");
	num2 = teclado.nextInt();
	
	if (num1 > num2) {
		System.out.printf("El número %d es mayor que %d.", num1, num2);
	} else if (num1 < num2) {
		System.out.printf("El número %d es menor que %d.", num1, num2);
	} else {
		System.out.printf("Los números son iguales.");
	}
	teclado.close();
}
}
