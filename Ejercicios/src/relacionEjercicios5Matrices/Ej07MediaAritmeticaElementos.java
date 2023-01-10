package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej07MediaAritmeticaElementos {

	public static void main(String[] args) {
		//Dado un array de tamaño (N,M) de reales, calcula la media aritmética de sus valores.
		System.out.println("Programa que calculará la media aritmética de los valores de los elementos de una matriz proporcionada por el usuario.");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		double matriz[][] = new double [filas][columnas];
		
		libreriaMatriz.pedirMatriz(matriz);
		
		System.out.println("La matriz resultante es la siguiente: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		System.out.printf("La media aritmética de la matriz es %.2f.", libreriaMatriz.mediaAritmeticaElementos(matriz));
		teclado.close();
	}
}
