package relacionEjercicios3;

import java.util.Scanner;

public class Ej14DibujarRectanguloHuecoV2 { 
	public static void main(String[] args) {
		// Algoritmo que pida el alto y el ancho de un rectángulo (número entero) e imprima un rectángulo de asteriscos. Por ejemplo, si introducen 7 de ancho y cuatro de alto el resultado será:
	//	*******
	//	*     *
	//	*     *
	//	*******
		System.out.println("El algoritmo dibujará en pantalla un rectángulo con asteriscos según número de filas (ancho) y columnas (alto) indique el usuario.");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique el alto: ");
		int fila = teclado.nextInt();
		System.out.println("Indique el ancho: ");
		int columna = teclado.nextInt();
		
		while (fila<0 || fila>10) {
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10. (O, sino, no se mostrará en pantalla correctamente.");
			fila = teclado.nextInt();}
		while (columna<0 || columna>10) { 
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número entre 1 y 10. (O, sino, no se mostrará en pantalla correctamente.");
			columna = teclado.nextInt();}
		
		for (int i=1; i <= fila; i++) { 	//entro en bucle filas
			for (int j=1; j <= columna; j++) { //entro en bucle columnas
				if ( i==1 || j==1 || i==fila || j==columna) { //si es la primera fila, la primera columna, la última fila o la última columna
					System.out.printf("*"); //escribe asterisco
				} else { //sino
					System.out.printf(" "); //escribe espacio
				}
			}
			System.out.println(); //salto de linea
	}
		teclado.close();
	}	
}
