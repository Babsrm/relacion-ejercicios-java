package relacionEjercicios4ConFunciones;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej05MoverPosicionArrayDerPidiendoPos {

	public static void main(String[] args) {
		// Dado un array de enteros de tamaño N, rotar sus valores una posición a la derecha, es decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el array rotado a la derecha: 4 5 -1 -3 15
		
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
		System.out.println("¿Cuántas rotaciones quieres en tu array?");
		int rotacion = teclado.nextInt();
		LibreriaFunciones.moverPosicionDerConPos(array, rotacion);
		System.out.printf("El array rotado %d a la derecha es: ", rotacion);
		LibreriaFunciones.mostrarVector(array);
		
		teclado.close();
	}

}
