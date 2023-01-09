package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej11CalcularSumaDosArrays {

	public static void main(String[] args) {
		// Dados dos vectores, calcular la suma de ambos.
		
		System.out.println("Se le piden al usuario dos vectores (arrays), el subprograma devolverá la suma de ambos.");
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
		LibreriaFunciones.pedirVector(array2);
		
		while (longitud1 != longitud2) {
			System.out.println("Los vectores han de tener la misma longitud. Por favor, empiece de nuevo el proceso.");
			System.out.println("¿Cuántos elementos quieres en tu array 1?");
			longitud1 = teclado.nextInt();
			array1 = new int [longitud1];
			System.out.println("Introduce el vector 1:");
			LibreriaFunciones.pedirVector(array1);
			
			System.out.println("¿Cuántos elementos quieres en tu array 2?");
			longitud2 = teclado.nextInt();
			array2 = new int [longitud2];
			System.out.println("Introduce el vector 2:");
			LibreriaFunciones.pedirVector(array2);
		};
		
		System.out.print("El array1 introducido es: ");
		LibreriaFunciones.mostrarVector(array1);
		System.out.println("El array2 introducido es: ");
		LibreriaFunciones.mostrarVector(array2);
		
		int sumaArrays[] = LibreriaFunciones.sumaArrays(array1, array2);
		System.out.println("La suma de ambos arrays es: ");
		LibreriaFunciones.mostrarVector(sumaArrays);

		teclado.close();
	}

}
