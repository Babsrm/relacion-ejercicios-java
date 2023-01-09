package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej10ConcatenarArrays {

	public static void main(String[] args) {
		// Dados dos array de enteros de tamaños N y M respectivamente, concatenarlos en un nuevo array de tamaño N+M, es decir si los arrays de entrada son por ejemplo: 5 -1 -3 15 4 y 3 4 2, el array concatenado resultado deberá ser: 5 -1 -3 15 4 3 4 2.

		System.out.println("Se le piden al usuario dos vectores (arrays), el subprograma concatenará ambos y mostrará el resultado..");
		Scanner teclado = new Scanner(System.in);
		int array1[];
		int array2[];
		int longitud1, longitud2;
		
		System.out.println("¿Cuántos elementos quieres en tu array 1?");
		longitud1 = teclado.nextInt();
		array1 = new int [longitud1];
		System.out.println("Introduce el vector 1:");
		LibreriaFunciones.pedirVector(array1);
		
		System.out.println("¿Cuántos elementos quieres en tu array 2?");
		longitud2 = teclado.nextInt();
		array2 = new int [longitud2];
		System.out.println("Introduce el vector 2:");
		LibreriaFunciones.pedirVector(array2)
		
		;System.out.print("El array1 introducido es: ");
		LibreriaFunciones.mostrarVector(array1);
		System.out.println("El array2 introducido es: ");
		LibreriaFunciones.mostrarVector(array2);
		
		int concatenado[] = LibreriaFunciones.concatenarArrays(array1, array2, longitud1, longitud2);
		LibreriaFunciones.mostrarVector(concatenado);
		
		System.out.println("Los dos arrays concatenados ya a la inversa son: ");
		LibreriaFunciones.mostrarVector(
				LibreriaFunciones.concatenarArrays(
						LibreriaFunciones.arrayInverso(array1, longitud1), 
						LibreriaFunciones.arrayInverso(array2, longitud2), 
						longitud1,
						longitud2));
		
		teclado.close();
	}
	

}
