package relacionEjercicios5Matrices;

import java.util.Scanner;

import funciones.libreriaMatriz;

public class EjercicioBase {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce el número de filas: ");
	int filas = teclado.nextInt();
	System.out.println("Introduce el número de columnas: ");
	int columnas = teclado.nextInt();
	
	//asigno memoria a la matriz
	int matriz[][] = new int [filas][columnas];
	
	System.out.println("Introduce la matriz:");
	libreriaMatriz.pedirMatriz(matriz);
	
	System.out.println("La matriz introducida es: ");
	libreriaMatriz.mostrarMatriz(matriz);

	teclado.close();
	}

}
