package relacionEjercicios2;

import java.util.Scanner;

public class ej04ComprobarExistenciaTrianguloSegunCatetos {

	public static void main(String[] args) {
		// Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un triángulo con esas dimensiones.
		//si la suma de dos lados es mayor que el valor del lado restante, existirá triángulo. se ha de cumplir las 3 condiciones posibles.
		Scanner teclado = new Scanner(System.in);
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Introduzca el valor del primer lado: ");
		lado1 = teclado.nextDouble();
		System.out.println("Introduzca el valor del segundo lado: ");
		lado2 = teclado.nextDouble();
		System.out.println("Introduzca el valor del tercer y último lado: ");
		lado3 = teclado.nextDouble();
		
		if ( ((lado1 + lado2) > lado3)
				&&
			  ((lado2 + lado3) > lado1)
			  	&&
			  ((lado1 + lado3) > lado2)) {
			System.out.printf("Existe triángulo con los valores de los siguiente catetos: %.2f, %.2f, %.2f.\n", 
					lado1, lado2, lado3);
		} else {
			System.out.println("No existe triángulo con los valores de los catetos introducidos.");
		}
		teclado.close();
		}
	}


