package relacionEjercicios3;

import java.util.Scanner;

public class Ej14DibujarRectanguloHueco {

	public static void main(String[] args) {
		// // Algoritmo que pida el alto y el ancho de un rectángulo (número entero) e imprima un rectángulo de asteriscos. Por ejemplo, si introducen 7 de ancho y cuatro de alto el resultado será:
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
			
			for (int i=1; i <= fila; i++) { //entramos en el bucle de cada fila
				
				for (int j=1; j <= columna; j++) { //entramos en el bucle de cada fila y columna
					if (i==1 || i==fila) { //si es la primera o ultima fila, que la pinte entera de asteriscos
						System.out.printf("*");
					}
	
					else if (i!=1 && i!=fila) { //si no es la primera fila ni la última
//					else { //si no es la primera fila ni la última (puedo quitar la linea anterior y dejar esta, sería lo mismo)
						if (j==1 || j==columna) { //si en columna es la primera o última posición
							System.out.printf("*"); // que me escriba asterisco
						} else {
							System.out.printf(" "); //sino que me escriba espacio
						}
					}
				}
				System.out.printf("\n"); 
			
			}
			teclado.close();
	}

}
