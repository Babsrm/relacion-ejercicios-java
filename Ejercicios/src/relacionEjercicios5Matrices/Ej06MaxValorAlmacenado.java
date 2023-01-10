package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej06MaxValorAlmacenado {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de enteros, buscar el máximo valor almacenado. 
		System.out.println("Dada una matriz proporcionada por el usuario, el programa mostrará cuál es el máximo valor almacenado en ella.");

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		int matriz[][] = new int [filas][columnas];
		
		libreriaMatriz.pedirMatriz(matriz);
		
		System.out.println("La matriz introducida es la siguiente: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		System.out.printf("El máximo valor en un elemento de la matiz es %d.", libreriaMatriz.valorMaximoEnMatriz(matriz));
		
		teclado.close();
	}

}
