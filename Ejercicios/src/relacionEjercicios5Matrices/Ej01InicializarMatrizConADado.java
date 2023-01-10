package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej01InicializarMatrizConADado {

	public static void main(String[] args) {
		// Dada una matriz de tamaño (N,M) de enteros, inicializarla a un valor dado A.
		System.out.println("Se le pide al usuario tres valores: dos para crear una matriz del tamaño que determine y un tercer valor para inicializar la matriz con él.");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		System.out.println("Introduce el valor de 'a': ");
		int a = teclado.nextInt();
		
		int matriz[][] = new int [filas][columnas];
		
		libreriaMatriz.pedirMatrizValorA(matriz, a);
		
		System.out.println("La matriz resultante es la siguiente: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		teclado.close();
	}

}
