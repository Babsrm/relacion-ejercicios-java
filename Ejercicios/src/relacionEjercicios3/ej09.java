package relacionEjercicios3;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		// Algoritmo que pida 10 números por teclado, después de pedirlos deberá indicar cuántos eran positivos, cuántos eran negativos y cuántos eran cero.
		System.out.println("El usuario ha de indicar 10 números; el algoritmo hará un recuento de ellos indicando el número de positivos, negativos y ceros introducidos.");
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador = 1; //es la variable que me hace pedir el número 10 veces.
		int contadorPos =0, contadorNeg =0, contadorCero =0; //variables para guardar el recuento según su signo
		
		while (contador <= 10) {
			System.out.println("Introduzca un número: ");
			num = teclado.nextInt();
			if (num == 0) {
				contadorCero++;
			} else if (num <0) {
				contadorNeg++;
			} else {
				contadorPos++;
			}
			contador++;
		} 
		System.out.printf("El recuento es de:\n"
				+ "%d números positivos,\n"
				+ "%d números negativos,\n"
				+ "%d ceros.", contadorPos, contadorNeg, contadorCero);
		teclado.close();
	}

}
