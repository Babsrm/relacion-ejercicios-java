package arrays;

import java.util.Scanner;

public class EjercicioBase02 {
public static void main(String[] args) {
	//Pedir un vector de números variables por teclado y mostrarlo
	Scanner teclado = new Scanner(System.in);
	
	int longitud;
	
	do {
		System.out.println("¿Cuántos elementos quieres? (entre 1 y 10) :");
		longitud = teclado.nextInt();
	} while (longitud<1 || longitud>10);
	
	double array[] = new double[longitud];
	
	for (int i = 0; i < array.length; i++) {
		System.out.println("Introduce el elemento "+i);
		array[i]=teclado.nextDouble();
	}
	System.out.printf("Tu array es ");
	for (int i = 0; i < array.length; i++) {
		System.out.printf("%.2f, ", array[i]);
	}
teclado.close();	
}
}
