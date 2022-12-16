package relacionEjercicios1;

import java.util.Scanner;

public class ej4 {
public static void main(String[] args) {
	// Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
	Scanner teclado = new Scanner(System.in);
	
	int grados;
	
	System.out.println("Introduzca los grados centígrados: ");
	grados = teclado.nextInt();
	
	System.out.printf("%d ºC son equivalentes a %d ºF.", grados, (32+(9*grados/5)));
	teclado.close();
	
}
}
