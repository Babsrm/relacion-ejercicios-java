package relacionEjercicios1;

import java.util.Scanner;

public class Ej03DobleTripleNum {

	public static void main(String[] args) {
		// 3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		
		System.out.printf("El doble de %d es %d.\n", num, num*2);
		System.out.printf("El triple de %d es %d.\n", num, num*3);
		teclado.close();

	}

}
