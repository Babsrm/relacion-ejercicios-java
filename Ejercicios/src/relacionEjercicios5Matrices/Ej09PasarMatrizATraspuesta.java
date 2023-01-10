package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej09PasarMatrizATraspuesta {

	public static void main(String[] args) {
		// Dada un array de tamaño (M,N) de reales, almacenarlo sobre otro array de tamaño (N,M) de forma transpuesta, es decir, el elemento (1,2) del primer array se almacenará en el elemento (2,1) del segundo. 

		System.out.println("El programa transformará la matriz proporcionada por el usuario a una nueva matriz de forma traspuesta.");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		double matriz[][] = new double [filas][columnas];
		
		System.out.println("Introduce la matriz:");
		libreriaMatriz.pedirMatriz(matriz);
		
		System.out.println("La matriz introducida es: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		System.out.println("La matriz traspuesta es: ");
		libreriaMatriz.mostrarMatriz(libreriaMatriz.convertirATraspuesta(matriz));
		
		teclado.close();
	}
}
