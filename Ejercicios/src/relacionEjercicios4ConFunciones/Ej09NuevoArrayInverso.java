package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej09NuevoArrayInverso {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño pero de forma inversa, es decir, si por ejemplo el array de entrada es: 5 -1 -3 15 4, el resultado debe ser un nuevo array cuyos valores son: 4 15 -3 -1 5.

		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		System.out.println("Dado un array de enteros indicado por el usuario, el subprograma devuelve un nuevo array con los valores en la posición inversa al original.");
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new int [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		System.out.print("El array introducido es: ");
		LibreriaFunciones.mostrarVector(array);
		
		int inverso[]= LibreriaFunciones.arrayInverso(array, longitud);
		System.out.println("El vector inverso es: ");
		LibreriaFunciones.mostrarVector(inverso);
		
		teclado.close();
	}

}
