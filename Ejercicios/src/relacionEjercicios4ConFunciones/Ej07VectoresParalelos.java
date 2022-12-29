package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej07VectoresParalelos {

	public static void main(String[] args) {
		// Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores son proporcionales. 
		
		System.out.println("Se le piden al usuario dos vectores (arrays) y el logaritmo determinará si son paralelos o no.");
		Scanner teclado = new Scanner(System.in);
		double array1[];
		double array2[];
		int longitud1, longitud2;
		
		System.out.println("¿Cuántos elementos quieres en tu array 1?");
		longitud1 = teclado.nextInt();
		array1 = new double [longitud1];
		System.out.println("Introduce el vector 1:");
		LibreriaFunciones.pedirVector(array1);
		
		System.out.println("¿Cuántos elementos quieres en tu array 2?");
		longitud2 = teclado.nextInt();
		array2 = new double [longitud2];
		System.out.println("Introduce el vector 2:");
		LibreriaFunciones.pedirVector(array2);
		
		while (longitud1 != longitud2) {
			System.out.println("Los vectores han de tener la misma longitud. Por favor, empiece de nuevo el proceso.");
			System.out.println("¿Cuántos elementos quieres en tu array 1?");
			longitud1 = teclado.nextInt();
			array1 = new double [longitud1];
			System.out.println("Introduce el vector 1:");
			LibreriaFunciones.pedirVector(array1);
			
			System.out.println("¿Cuántos elementos quieres en tu array 2?");
			longitud2 = teclado.nextInt();
			array2 = new double [longitud2];
			System.out.println("Introduce el vector 2:");
			LibreriaFunciones.pedirVector(array2);
		};
		
		System.out.print("El array1 introducido es: ");
		LibreriaFunciones.mostrarVector(array1);
		System.out.println("El array2 introducido es: ");
		LibreriaFunciones.mostrarVector(array2);

		LibreriaFunciones.vectorParalelo(array1, array2);
		teclado.close();
	}

}
