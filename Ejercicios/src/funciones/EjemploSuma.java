package funciones;

import java.util.Scanner;

public class EjemploSuma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double res = sumar(7,8);
		System.out.println("La suma es "+res);
		System.out.printf("La suma de 5 y -8 es: %.2f\n", sumar(5,-8));
		System.out.println("Introduce un número: ");
		double a = teclado.nextDouble();
		System.out.println("Introduce un número: ");
		double b = teclado.nextDouble();
		System.out.printf("La suma de %.2f y %.2f es: %.2f", a, b, sumar(a,b));
		
		escribeHola(8);
		teclado.close();
	}
	public static double sumar (double num1, double num2) { //funcion
		return num1 + num2;  //siempre tiene return
	}
	public static void escribeHola (int veces) { //procedimiento
		for (int i = 0; i < veces; i++) { //tiene void en vez de definir. no tiene return
			System.out.println("Hola"); //se llama sin syso
		}
	}
}
