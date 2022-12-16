package relacionEjercicios1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		Scanner teclado = new Scanner(System.in);
		
		float velocidad;
		
		System.out.println("Introduzca la velocidad a convertir: ");
		velocidad = teclado.nextFloat();
		
		System.out.printf("%.2f km/h es equivalente a %.2f m/s.", velocidad, velocidad*1000.0/3600);
		
		teclado.close();
	}

}
