package arrays;

import java.util.Scanner;

public class EjemploVector {

	public static void pedirVector (int vector[]) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i]=teclado.nextInt();
		}
		teclado.close();
		
	}
	public static void mostrar_vector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]+" ");
		}
		System.out.println();
		

}}
