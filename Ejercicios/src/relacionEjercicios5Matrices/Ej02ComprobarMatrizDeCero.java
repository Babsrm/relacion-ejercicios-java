package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej02ComprobarMatrizDeCero {

	public static void main(String[] args) {
		// Dado una matriz de tamaño (N,M) de enteros, decir si todos sus elementos son cero.
		System.out.println("En este ejercicio, el programa comprobará si la matriz es nula (todos sus elementos son cero.");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		int matriz[][] = new int [filas][columnas];
		
		System.out.println("Introduce la matriz:");
		libreriaMatriz.pedirMatriz(matriz);
		
		System.out.println("La matriz introducida es: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		if (libreriaMatriz.comprobarMatrizNula(matriz)) {
			System.out.println("La matriz es nula: está compuesta por ceros.");
		} else {
			System.out.println("La matriz no es nula.");
		}
		teclado.close();
	}

}
