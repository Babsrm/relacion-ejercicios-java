package arrays;
import java.util.Scanner;

public class PruebaVector {
	public static void main(String[] args) {
		int vector1[], vector2[];
		int longitud;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuántos elementos quieres para el vector?");
		longitud = teclado.nextInt();
		vector1 = new int [longitud];
		vector2 = new int [longitud];
		
		System.out.println("Introduce el primer vector: ");
		EjemploVector.pedirVector(vector1);
		System.out.println("Introduce el segundo vector: ");
		EjemploVector.pedirVector(vector2);
		
		System.out.println("Tu primer array es: ");
		EjemploVector.mostrar_vector(vector1);
		
		System.out.println("Tu segundo array es ");
		EjemploVector.mostrar_vector(vector2);
		teclado.close();
	}
}
