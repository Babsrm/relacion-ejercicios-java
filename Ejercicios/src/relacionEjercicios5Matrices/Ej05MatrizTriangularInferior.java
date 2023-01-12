package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej05MatrizTriangularInferior {

	public static void main(String[] args) {
		//Dado un array de tamaño (N,M), decir si la matriz así representada es triangular inferior. Ejemplo:
		//3  0  0
		//7  7  0
		//−3  2  1
		System.out.println("El programa determinará si la matriz introducida por el usuario es triangular inferior.");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		while (filas != columnas) {
			System.err.println("La matriz ha de tener el mismo número de filas que de columnas. Por favor, empiece de nuevo el proceso.");
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
		
		if (libreriaMatriz.comprobarTriangularSuperior(matriz) 
				&& 
				libreriaMatriz.comprobarTriangularInferior(matriz))
			System.out.println("Es la matriz diagonal o nula.");
		else if (libreriaMatriz.comprobarTriangularInferior(matriz)) {
			System.out.println("La matriz es triangular inferior.");
		} else if (libreriaMatriz.comprobarTriangularSuperior(matriz)) {
			System.out.println("La matriz es triangular superior.");
		} else { 
			System.out.println("Es una matriz normal.");
		}
		
		teclado.close();
		
	}

}
