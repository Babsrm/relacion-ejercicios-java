package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej13MatrizSimetrica {

	public static void main(String[] args) {
		// Desarrollar  un  programa  en  el  que  se  pida  al  usuario  una  matriz  de  dimensiones N ×M, y compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
		//Una matriz simétrica es como doblar la matriz por la mitad (diagonal) y ser un espejo

		System.out.println("El programa determinará si la matriz introducida por el usuario es simétrica.");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		while (filas != columnas) {
			System.err.println("La matriz ha de ser cuadrada (tener el mismo número de filas que de columnas). Por favor, empiece de nuevo el proceso.");
			System.out.println("Introduce el número de filas: ");
			filas = teclado.nextInt();		
			System.out.println("Introduce el número de columnas: ");
			columnas = teclado.nextInt();
		};
		
		double matriz[][] = new double [filas][columnas];
		
		System.out.println("Introduce la matriz:");
		libreriaMatriz.pedirMatriz(matriz);
		
		System.out.println("La matriz introducida es: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		if (libreriaMatriz.esSimetrica(matriz)) {
			System.out.println("La matriz es simétrica.");
		} else { System.out.println("La matriz no es simétrica.");}
		
		teclado.close();
	}

}
