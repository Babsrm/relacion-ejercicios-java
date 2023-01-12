package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej10MultiplicacionMatrices {

	public static void main(String[] args) {
		// Realizar un programa para multiplicar matrices. El índice de la matriz resultante se calcula como (n,m)x(m,p) = (n,p)
		System.out.println("El usuario introducirá dos matrices y el programa hará la multiplicación de ambas.");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primera matriz.");
		System.out.println("Introduce el número de filas: ");
		int filas1 = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas1= teclado.nextInt();
		double matriz1[][] = new double [filas1][columnas1];
		libreriaMatriz.pedirMatriz(matriz1);
		
		System.out.println("Segunda matriz.");
		System.out.println("Introduce el número de filas: ");
		int filas2 = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas2= teclado.nextInt();
		double matriz2[][] = new double [filas2][columnas2];
		libreriaMatriz.pedirMatriz(matriz2);
		
		System.out.println("La primera matriz es: ");
		libreriaMatriz.mostrarMatriz(matriz1);
		System.out.println("y la seguna matriz es: ");
		libreriaMatriz.mostrarMatriz(matriz2);
		
		System.out.println("La matriz multiplicada es: ");
		libreriaMatriz.mostrarMatriz(libreriaMatriz.multiplicacionMatrices(matriz2, matriz2, filas1, columnas2));
		
		teclado.close();
	}

	

}
