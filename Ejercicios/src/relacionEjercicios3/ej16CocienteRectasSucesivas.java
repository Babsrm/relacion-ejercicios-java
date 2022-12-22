package relacionEjercicios3;

import java.util.Scanner;

public class ej16CocienteRectasSucesivas {

	public static void main(String[] args) {
		// Algoritmo que pida dos números naturales e imprimir su cociente entero por el método de las restas sucesivas
		System.out.println("El algoritmo devolverá el cociente entero de dos "
				+ "números naturales mediante el método de las restas sucesivas.");
		Scanner teclado = new Scanner(System.in);
		int dividendo, divisor, resto, cociente=0;
		
		System.out.println("Introduzca el dividendo: ");
		dividendo = teclado.nextInt();
		System.out.println("Introduzca el divisor: ");
		divisor = teclado.nextInt();
		
		resto = dividendo; //al asignar el valor de dividendo al resto, nos permite hacer la resta del divisor con el valor correcto del dividendo en la primera ecuación
		
		
		while (resto >= divisor) {
			resto = resto-divisor;
			cociente++; //contador del cociente. el cociente de la división es el número de veces que se ha ejecutado la recta
			System.out.printf("%d\n", resto);
			}
		System.out.printf("El cociente es %d y el resto %d.", cociente, resto);
		teclado.close();
	}
}
