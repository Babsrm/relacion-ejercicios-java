package relacionEjercicios2;

import java.util.Scanner;

public class ej05ComparacionCasillasAjedrez {

	public static void main(String[] args) {
		// Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar si están en la misma fila, columna, o en la misma diagonal. 
		System.out.println("El usuario debe de introducir dos casillas de un tablero de ajedrez (fila, columna; ej: 1,5), el logaritmo responderá si las casillas están en la misma fila, columna o diagonal.");
		
		Scanner teclado = new Scanner(System.in);
		
		int fila1;
		int colum1;
		int fila2;
		int colum2;
		
		System.out.println("Introduzca el valor de la fila de la primera casilla: ");
		fila1 = teclado.nextInt();
		System.out.println("Introduzca el valor de la columna de la primera casilla: ");
		colum1 = teclado.nextInt();
		System.out.println("Introduzca el valor de la fila de la segunda casilla: ");
		fila2 = teclado.nextInt();
		System.out.println("Introduzca el valor de la columna de la segunda casilla: ");
		colum2 = teclado.nextInt();
		
		System.out.printf("Las casillas introducidas son: %dx%d y %dx%d.\n", fila1, colum1, fila2, colum2);
		
		if ((fila1 < 1) || (fila1 > 8) ||
			(colum1 < 1) || (colum1 > 8) ||
			(fila2 < 1) || (fila2 > 8) 	||
			(colum2 < 1) || (colum2 > 8)) {
			System.out.println("Los valores introducidos no son válidos. Elija casillas comprendidas entre 1 y 8 ambos incluídos.");
			//System.exit(); 
		}
		if ((fila1 == fila2) && (colum1 == colum2)) {
			System.out.println("Las casillas son la misma.");
		}
		else if (fila1 == fila2) {
			System.out.printf("Las casillas se encuentran en la misma fila, %d.\n", fila1);
		} else if (colum1 == colum2) {
			System.out.printf("Las casillas se encuentran en la misma columna, %d.\n", colum1);
		} else if (((fila1 - colum1) == (fila2 - colum2)) 
					|| 
				  ((fila1 + colum1) == (fila2 + colum2))) {
			System.out.println("Las casillas se encuentran en la misma diagonal.");
		} else {
			System.out.println("Las casillas no se encuentras ni en la misma línea, ni en la misma columna ni en la misma diagonal.");
		}
		teclado.close();
	}

}
