package relacionEjercicios1;

import java.util.Scanner;

public class Ej05LongitudAreaCircunferencia {

	public static void main(String[] args) {
		//  Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		Scanner teclado = new Scanner(System.in);
		
		float radio;
		
		System.out.println("Introduzca el radio de la circunferencia en cm: ");
		radio = teclado.nextFloat();
		
		System.out.printf("La longitud de la circunferencia es %.2f centímetros.\n"
				+ "El área de la circunferencia es %.2f cm^2.\n", 
				2*Math.PI*radio, 
				Math.PI*Math.pow(radio,2));
		
		teclado.close();
	}

}
