package relacionEjercicios4;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej06ValoresArrayDesdeNum {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array mayor que un número A, y a partir de él inclusive, visualizar todos los valores de los siguientes hasta el último elemento del array.
		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		System.out.println("Dado un array de enteros indicado por el usuario, éste indicará un número a. Una vez dentro del array, se mostrarán los valores del array cuando se haya encontrado el primer elemento que sea mayor que a");
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new int [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		
		int a;
		System.out.println("Introduzca el valor de a: ");
		a = teclado.nextInt();
		System.out.print("El array introducido es: ");
		LibreriaFunciones.mostrarVector(array);
		System.out.printf("El array desde que encuentra la posición >=%d es: ", a);
		LibreriaFunciones.mostrarDesdeValorMayorQueA(array, a);
	}

}
