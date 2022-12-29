package funciones;

import java.util.Scanner;

public class LibreriaFunciones {
	public static void pedirVector(double vector[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento " + i);
			vector[i] = teclado.nextDouble();
		}
	}
	// parece la misma funcion de arriba pero esta es para numeros int. es la misma
	// funcion, sí, pero java sabe diferenciar cuál de las dos utilizar cuando la
	// invocamos por el tipo de dato

	public static void pedirVector(int vector[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento " + i);
			vector[i] = teclado.nextInt();
		}
	}

	public static void mostrarVector(double vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.2f ", vector[i]);
		}
		System.out.println(); // salto de linea, por estética
	}

	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%d ", vector[i]);
		}
		System.out.println(); // salto de linea, por estética
	}

	public static void mostrarMenorQue(int vector[], int tope) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < tope) {
				System.out.print(vector[i] + " ");
			}
		}
	}

	public static int devolverMenor(int vector[]) {
		int menor = vector[0];
		// int menor = vector[vector.length-1]; con este cogeríamos el último pero es
		// más sencillo empezar por la primera posición
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < menor) {
				menor = vector[i];
			}
		}
		return menor;
	}

	public static void mostrarIntervalo(double vector[], double a, double b) {
		if (a > b) {
			double var = b;
			b = a;
			a = var;
		}
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] >= a && vector[i] <= b) {
				System.out.println(vector[i] + " ");
			}

		}
	}

	public static void moverPosicionIzq(int vector[]) {
		int aux = vector[0];
		for (int i = 0; i < vector.length - 1; i++) { // la condicion tiene que ser hasta el penúltimo porque en el
														// último he de poner el primero
			vector[i] = vector[i + 1]; // v[1]=v[2], osea voy moviendo los resultados a la izq, y el[0] que tiene que
										// irse al final, lo guardo en una variable auxiliar y, una vez hecho el bucle,
										// la sustituyo.
		}
		vector[vector.length - 1] = aux; // si la longitud es 5, hay que poner el 4; de ahí el restarle 1
	}

	public static void moverPosicionDer(int vector[]) {
		int aux = vector[vector.length - 1];
		for (int i = vector.length - 1; i >= 1; i--) {
			vector[i] = vector[i - 1];
		}
		vector[0] = aux;
	}

	public static void mostrarDesdeValorMayorQueA(int vector[], int a) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] >= a) {
				System.out.print(vector[i] + " ");
			}

		}
	}
	
	public static void vectorParalelo (double vector1[], double vector2[]) {
		int contador = 0;
		for (int i = 0; i < vector1.length; i++) {
			if (vector2[i] % vector1[i] == 0) {
				contador++;}
			
			}if (contador == vector1.length) {
				System.out.println("Los vectores son paralelos.");
			}else {System.out.println("Los vectores no son paralelos.");
			}
		}
}
