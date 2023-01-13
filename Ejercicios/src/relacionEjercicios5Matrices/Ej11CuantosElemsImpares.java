package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej11CuantosElemsImpares {

	public static void main(String[] args) {
		// Desarrollar  un  programa  en  el  que  se  pida  al  usuario  un  vector  de  números enteros e indique en pantalla cuantos de dichos elementos son números impares. 
		
		System.out.println("El programa contará cuántos elementos de la matriz introducida por el usuario sean números impares.");
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
		
		System.out.println("La matriz contiene " + libreriaMatriz.cuantosImpares(matriz) + " elementos de números impares.");
		
		teclado.close();

	}

}
