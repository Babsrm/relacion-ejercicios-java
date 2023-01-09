package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej08CapicuaONoSinFuncion {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, decir si es capicúa o no, es decir, si por ejemplo el array es: 5 2 1 2 5, el resultado debe ser “verdad”(se debe tener en cuenta que el tamaño el array puede ser par o impar).
		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		System.out.println("Dado un array de enteros indicado por el usuario, éste indicará si es capicúa. El tamaño del array puede ser par o impar.");
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new int [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		
		if (longitud%2 != 0) {
			System.out.println("Array con índice impar.");
			int aux = (int)Math.ceil (longitud/2); //posición céntrica del array
			int j = array.length -1; //posición final, el -1 se tiene que pone porque sino sale de rango de índices del array
			int contador = 0;
			for (int i = 0 ; i < aux ; i++) { //pasamos posición a posición checkeando, desde el final al inicio
				if (array[i] == array[j]) {
					contador++;
				}
				j--;
				} 
			if (contador == longitud/2) {
				System.out.println("El vector es capicúa.");
			} else {
				System.out.println("El vector no es capicúa.");
			}
		};
		if (longitud%2 == 0) {
			System.out.println("Array con índice par.");
			int aux = longitud/2; //posición céntrica del array
			int j = array.length -1; //posición final, el -1 se tiene que pone porque sino sale de rango de índices del array
			int contador = 0;
			for (int i = 0 ; i <= aux ; i++) { //pasamos posición a posición checkeando, desde el final al inicio
				if (array[i] == array[j]) {
					contador++;
				}
				j--;
				} 
			if (contador >= longitud/2) {
				System.out.println("El vector es capicúa.");
			} else {
				System.out.println("El vector no es capicúa.");
			}
		}
		teclado.close();
	}

}
