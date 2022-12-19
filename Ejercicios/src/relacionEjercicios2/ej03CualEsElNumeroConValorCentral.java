package relacionEjercicios2;

import java.util.Scanner;

public class ej03CualEsElNumeroConValorCentral {

	public static void main(String[] args) {
		//  Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la posición central si los tres se ordenasen. 
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Indicar tres números diferentes (pueden ser decimales), se indicará cuál es el que ocupa la posición central.");
		
		float num1;
		float num2;
		float num3;
		
		System.out.println("Introduzca el primer número: ");
		num1 = teclado.nextFloat();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextFloat();
		System.out.println("Introduzca el tercer y último número: ");
		num3 = teclado.nextFloat();
		
		if ( 
			((num2 < num1) && (num2 > num3)) //321
				||
			((num1 < num2) && (num2 < num3))) {  //123
			System.out.printf("El número central es %f", num2);
		} else if ( 
				((num1 > num2) && (num1 < num3)) //213
				||
				(num1 > num3) && (num1 < num2)) { //231
			System.out.printf("El número central es %f", num1);
		} else if ( (num3 < num1) && (num3 > num2) //312
				||
				(num1 < num3) && (num3 < num2)) { //132
			System.out.printf("El número central es %f", num3);
		} else {
			System.out.println("Los tres números son iguales.");
		}
		
		teclado.close();
	}

}
