package relacionEjercicios1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// 2. Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Introduzca su nombre: ");
		nombre = teclado.nextLine();
		
		System.out.printf("¡Buenos días, %s!", nombre);
		
		//cerramos el teclado
		teclado.close();
		
	}

}
