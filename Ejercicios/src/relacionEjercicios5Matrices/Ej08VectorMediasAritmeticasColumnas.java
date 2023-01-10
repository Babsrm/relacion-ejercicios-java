package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.LibreriaFunciones;
import funciones.libreriaMatriz;

public class Ej08VectorMediasAritmeticasColumnas {

	public static void main(String[] args) {
		// Dada una   matriz de (N,M) de enteros devolver un vector con las medias de las columnas, Por ejmplo, dada la matriz:
		//3  1  5
		//2  7  2        El vector resultante será 
		//1  0  2            (2  2.6666  3)  ya que (3+2+1)/3=2
		
		System.out.println("El programa determinará un vector con las medias de las columnas de la matriz introducida por el usuario.");
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
		
		System.out.printf("El vector resultante de las medias de las columnas es: ");
		LibreriaFunciones.mostrarVector(libreriaMatriz.vectorMediasColumnas(matriz));
		
		teclado.close();
	}

}
