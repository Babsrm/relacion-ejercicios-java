package relacionEjercicios1;

import java.util.Scanner;

public class Ej01PedirDatosMostrarDatos {

	public static void main(String[] args) {
		// Pedir por teclado los siguientes datos del usuario: nombre, edad, precio en kg con decimales.
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad;
		float peso;
		
		System.out.println("Introduzca su nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduzca su edad: ");
		edad = teclado.nextInt();
		System.out.println("Introduzca su peso con decimales: ");
		peso = teclado.nextFloat();
		
		System.out.printf("Su nombre es %s, tiene %d años y su peso es %.2f kg.\n", nombre, edad, peso);
		System.out.println("Su nombre es " +nombre +", tiene " +edad +" años y su peso es de " +peso +" kg.");
		
		//cerramos el teclado
		teclado.close();

	}

}
