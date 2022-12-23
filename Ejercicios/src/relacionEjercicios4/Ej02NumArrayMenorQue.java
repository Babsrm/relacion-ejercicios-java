package relacionEjercicios4;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej02NumArrayMenorQue {

	public static void main(String[] args) {
		//  Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del mismo cuyo valor sea menor que un número A. 
		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new int [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		
		System.out.println("Indica hasta qué número quieres que te muestre los resultados: ");
		int tope = teclado.nextInt();
		
		System.out.println("Los números menores que "+tope+" son: ");
		LibreriaFunciones.mostrarMenorQue(array, tope);

		teclado.close();
	}

}
