package funciones;

import java.util.Iterator;
import java.util.Scanner;

public class libreriaMatriz {

	public static void pedirMatriz(int matriz[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d)", i, j);
				matriz[i][j] = teclado.nextInt();
			}
		}
	}
	
	public static void pedirMatriz(double matriz[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d)", i, j);
				matriz[i][j] = teclado.nextInt();
			}
		}
	}

	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); // salto de línea
		}
	}
	
	public static void mostrarMatriz(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f ",matriz[i][j]);
			}
			System.out.println(); // salto de línea
		}
	}

	public static void pedirMatrizValorA(int matriz[][], int a) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = a;
			}
		}
	}

	public static boolean comprobarMatrizNula(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void contarNumerosEnElementos (double matriz[][], double a) {
		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == a) {
					contador++;
				}
			}
		}System.out.printf("El número de elementos iguales para a = %.2f es %d.", a, contador);
	} 
	
	public static boolean comprobarTriangularSuperior (double matriz[][]) {
		if (matriz.length != matriz[0].length) {
			System.err.println("Error, no se puede calcular una matriz triangular si no es cuadrada. El número de filas ha de ser igual al número de columnas. El programa se cerrará. Inténtelo de nuevo. ");
			return false;}
		for (int i = 1; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length - i; j++) {
				if (matriz[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean comprobarTriangularInferior (double matriz[][]) {
		if (matriz.length != matriz[0].length) {
			System.err.println("Error, no se puede calcular una matriz triangular si no es cuadrada. El número de filas ha de ser igual al número de columnas. El programa se cerrará. Inténtelo de nuevo. ");
			return false;}
		for (int i = 0; i < matriz.length -1; i++) {
			for (int j = i + 1; j <matriz[0].length ; j++) {
				if (matriz[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int valorMaximoEnMatriz (int matriz[][]) {
		int aux = matriz[0][0]; // tb se puede incializar con el menor valor posible: aux = Math.minInteger()
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (aux < matriz[i][j]) {
					aux = matriz[i][j];
				}
			} 
		}return aux;
	}
	
	public static double mediaAritmeticaElementos (double matriz[][]) {
		double totalElems = 0;
		double sumaElems = 0;
		double media;
		for (int i = 0; i < matriz.length; i++) {   
			for (int j = 0; j < matriz[0].length; j++) {
				totalElems++;
				sumaElems = sumaElems + matriz[i][j];		
			}
		} media = sumaElems/totalElems;
		return media;
	}
	
	public static double[] vectorMediasColumnas (int matriz[][]) {
		double vector[];
		vector = new double [matriz[0].length];
		double dividendo = 0;
		double aux = 0;
		
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {

				dividendo = dividendo + matriz[i][j];
			}
			aux = dividendo/matriz.length;
			vector[j] = aux;
			dividendo=0;
		}
		return vector;
	}
	
	public static double [][] convertirATraspuesta (double matriz[][]) {
		double traspuesta[][];
		traspuesta = new double [matriz[0].length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				 traspuesta[j][i] = matriz[i][j];
			}
		}return traspuesta;
	}
	
	public static double [][] multiplicacionMatrices (double matriz1[][], double matriz2[][], int filas1, int columnas2) {
		double matrizMultiplicada [][];
		matrizMultiplicada = new double [filas1][columnas2];
		
		for (int i = 0; i < matrizMultiplicada.length; i++) {
			for (int j = 0; j < matrizMultiplicada[0].length; j++) {
				matrizMultiplicada[i][j]=0; //reseteo el valor cada vez que cambia de casilla
				for (int k = 0; k < matriz2.length; k++) { //para que coja el valor correcto de la multiplicación
					matrizMultiplicada[i][j] =matrizMultiplicada[i][j]+ (matriz1[i][k]*matriz2[k][j]);
				}				
			}			
		}return matrizMultiplicada;
	}
}
