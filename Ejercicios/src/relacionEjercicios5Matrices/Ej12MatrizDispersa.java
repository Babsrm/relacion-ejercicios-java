package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej12MatrizDispersa {

	public static void main(String[] args) {
		//Desarrollar  un  programa  en  el  que  se  pida  al  usuario  una  matriz  de  dimensiones N    ×M, y compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo). 

		System.out.println("El programa determinará si la matriz introducida por el usuario es dispersa o no.");
		
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
		
		if (libreriaMatriz.esDispersa(matriz)) {
			System.out.println("La matriz es dispersa: tiene al menos un cero en cada fila y columna.");
		} else {
			System.out.println("La matriz no es dispersa.");
		}
		teclado.close();
	}
}
