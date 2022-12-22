package relacionEjercicios3;

import java.util.Scanner;

public class Ej13DibujarRectanguloRelleno {

	public static void main(String[] args) {
		// Algoritmo que pida el alto y el ancho de un rectángulo (número entero) e imprima un rectángulo de asteriscos. Por ejemplo, si introducen 7 de ancho y cuatro de alto el resultado será:
	//	*******
	//	*******
	//	*******
	//	*******
		System.out.println("El algoritmo dibujará en pantalla un rectángulo con asteriscos según número de filas (ancho) y columnas (alto) indique el usuario.");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique el alto: ");
		int alto = teclado.nextInt();
		System.out.println("Indique el ancho: ");
		int ancho = teclado.nextInt();
		
		while (alto<0 || alto>10) {
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10. (O, sino, no se mostrará en pantalla correctamente.");
			alto = teclado.nextInt();}
		while (ancho<0 || ancho>10) { 
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10. (O, sino, no se mostrará en pantalla correctamente.");
			ancho = teclado.nextInt();}
		
		for (int i=1; i <= alto; i++) {
			// el primer bucle que se ejecuta es el segundo (j), el que está anidado. entonces ese bucle nos dibuja las columnas (tantos asteriscos como el ancho haya indicado el usuario).
			for (int j=1; j <= ancho; j++) {
				System.out.printf("*");  //cuando termina este bucle, la siguiente linea es un salto de linea y empieza de nuevo con el bucle i en una nueva fila (alto) escribiendo los asteriscos (j, ancho). 
			}
			System.out.printf("\n"); //salto de linea
		}
		teclado.close();
	}

}
