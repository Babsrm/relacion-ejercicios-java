package relacionEjercicios1;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
		Scanner teclado = new Scanner(System.in);
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Introduzca el valor del primer lado: ");
		lado1 = teclado.nextFloat();
		System.out.println("Introduzca el valor del segundo lado: ");
		lado2 =  teclado.nextFloat();
		System.out.println("Introduzca el valor del tercer lado: ");
		lado3=teclado.nextFloat();
		
		double valorS = (lado1+lado2+lado3)/2.0; //es un valor que se tiene que calcular para poder calcular el área. se llama semiperímetro
		double area = Math.sqrt(valorS * (valorS-lado1)
										*(valorS-lado2)
										*(valorS-lado3));
		
		System.out.printf("El área del triángulo es %.2f", area);
		teclado.close();
		
		
	}

}
