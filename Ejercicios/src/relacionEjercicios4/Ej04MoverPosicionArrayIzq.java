package relacionEjercicios4;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej04MoverPosicionArrayIzq {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, rotar sus valores una posición a la izquierda, es decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el array rotado a la izquierda: -1 -3 15 4 5.
		System.out.println("El usuario nos indicará un array de enteros.");
		System.out.println("El algoritmo desplazará los valores hacia la izq una casilla.");
		Scanner teclado = new Scanner(System.in);
		int array[];
		int longitud;
		System.out.println("Vamos a seleccionar los números comprendidos entre a y b (indicados por el usuario) de un array de reales.");
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new int [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		System.out.print("El array introducido es: ");
		LibreriaFunciones.mostrarVector(array);
		LibreriaFunciones.moverPosicionIzq(array);
		System.out.print("El array rotado es: ");
		LibreriaFunciones.mostrarVector(array);
		
		teclado.close();
	}

}
