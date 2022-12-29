package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej01IntroducirValoresArray {

	public static void main(String[] args) {
		// Rellenar un array de tamaño N con valores enteros dados por el usuario a través del teclado
		// Tengo hecha ya la función en la librería de funciones así que la utilizo
		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		//ahora inicializamos el array y le asignamos el número de elementos que se nos ha indicado
		array = new int[longitud];
		
		//llamo a las funciones de mi librería
		System.out.println("Introduce los números");
		LibreriaFunciones.pedirVector(array);
		
		System.out.print("El array es: ");
		LibreriaFunciones.mostrarVector(array);
		teclado.close();
	}

}
