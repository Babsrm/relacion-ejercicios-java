package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej08CapicuaONoConFuncion {

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
		System.out.print("El array introducido es: ");
		LibreriaFunciones.mostrarVector(array);
		
		if (LibreriaFunciones.arrayCapicua(array)) {
			System.out.println("El array es capicúa.");
		} else {
			System.out.println("El array no es capicúa.");
		}
		
		teclado.close();
	}

}
