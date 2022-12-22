package relacionEjercicios1;

import java.util.Scanner;

public class Ej08VolumenEsfera {

	public static void main(String[] args) {
		// Programa que calcula el volumen de una esfera dado el radio.
		Scanner teclado = new Scanner(System.in);
		
		float radio;
		
		System.out.println("Introduzca el radio: ");
		radio = teclado.nextFloat();
		
		System.out.printf("El volumen de la esfera con radio %.2f es %.2f unidades métricas al cubo.", radio, 4.0/3.0*Math.PI*Math.pow(radio, 3));
		
		teclado.close();
	}

}
