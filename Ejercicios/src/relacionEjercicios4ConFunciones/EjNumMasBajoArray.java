package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class EjNumMasBajoArray {

	public static void main(String[] args) {
		// El algoritmo devolverá el número de menor valor de un array.
		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new int [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		
		System.out.println("Tu vector es ");
		LibreriaFunciones.mostrarVector(array);
		
		System.out.println("El menor elemento de vector es "
				+LibreriaFunciones.devolverMenor(array));
		
		int menor = LibreriaFunciones.devolverMenor(array);
		System.out.println("El menor es: "+menor); //tanto la forma de arriba como esta es correcta.
		//con esto muestro que puedo guardar el resultado de la función en una variable.
		
		teclado.close();

	}

}
