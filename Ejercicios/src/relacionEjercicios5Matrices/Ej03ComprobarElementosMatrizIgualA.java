package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class Ej03ComprobarElementosMatrizIgualA {

	public static void main(String[] args) {
		// Dado una matriz de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un número A dado.
		System.out.println("El usuario creará una matriz a su gusto. El programa determinará cuántos elementos tiene igual a un número A proporcionado por el usuario.");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		System.out.println("Introduce el valor de 'a': ");
		double a = teclado.nextInt();
		
		double matriz[][] = new double [filas][columnas];
		
		libreriaMatriz.pedirMatriz(matriz);
		
		System.out.println("La matriz resultante es la siguiente: ");
		libreriaMatriz.mostrarMatriz(matriz);
		
		int veces = libreriaMatriz.contarNumerosEnElementos(matriz, a);
		
		System.out.println("El número de elementos iguales para a = " +a +" es " +veces +".");
		;
		
		teclado.close();
	}

}
