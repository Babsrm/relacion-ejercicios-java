package relacionEjercicios3;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		// Algoritmo que sume los n primeros números enteros, siendo n un número introducido por el usuario.
		System.out.println("El usuario introducirá un número y el algoritmo se encargará de hacer la sumatoria desde 1 hasta el número introducido por el usuario.");
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca un número: ");
		num = teclado.nextInt();
		
		while (num<0) {
			System.out.println("El número introducido no es válido.");
			System.out.println("Por favor, introduzca un número positivo.");
			num = teclado.nextInt();}
		
		for ( int i=0 ; i <= num; i++) {
			System.out.printf("%d\n", i+i); //meter variable aqui para ir metiendo el resultado
		}
		
	}

}
