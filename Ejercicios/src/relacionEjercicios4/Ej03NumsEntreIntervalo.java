package relacionEjercicios4;

import java.util.Scanner;

import funciones.LibreriaFunciones;

public class Ej03NumsEntreIntervalo {
	public static void main(String[] args) {
		//Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del mismo cuyo valor pertenezca al intervalo [a,b].
		Scanner teclado = new Scanner(System.in);
		double array[];
		int longitud;
		System.out.println("Vamos a seleccionar los números comprendidos entre a y b (indicados por el usuario) de un array de reales.");
		System.out.println("¿Cuántos elementos quieres en tu array?");
		longitud = teclado.nextInt();
		
		array = new double [longitud];
		
		System.out.println("Introduce el vector:");
		LibreriaFunciones.pedirVector(array);
		
		double a, b;
		System.out.println("Introduzca el valor de a: ");
		a = teclado.nextDouble();
		System.out.println("Introduzca el valor de b: ");
		b = teclado.nextDouble();
		
		LibreriaFunciones.mostrarIntervalo(array, a, b);
		
		teclado.close();
	}
}
