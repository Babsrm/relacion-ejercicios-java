package funciones;

import java.util.Scanner;

public class EjemploOrdPorSeleccion {

	public static void main(String[] args) {
		// Programa que pide un vector por teclado y lo ordena	
		
				Scanner teclado = new Scanner (System.in);
				
				System.out.println("Introduce el número de elementos del vector: ");
				int longitud = teclado.nextInt();
				
				int numeros[] = new int[longitud];
				LibreriaFunciones.pedirVector(numeros);
				
				System.out.println("La función introducida es: ");
				LibreriaFunciones.mostrarVector(numeros);
				
				OrdenacionPorSeleccion.ordenacionPorSeleccion(numeros);
				
				System.out.println("Tu vector ordenado es: ");
				LibreriaFunciones.mostrarVector(numeros);
				
				teclado.close();

	}

}
