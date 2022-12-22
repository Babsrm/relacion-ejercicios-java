package relacionEjercicios1;

import java.util.Scanner;

public class Ej11TresCifrasSeparadas {

	public static void main(String[] args) {
		// Programa que lee un número de 3 cifras y muestra sus cifras por separado.
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int num2;
		int cifra1;
		int cifra2;
		int cifra3;
		
		
		System.out.println("Introduzca un número de 3 cifras: ");
		num = teclado.nextInt();
		
		String str = Integer.toString(num);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		// parte 2, calculado con matemáticas
		
		System.out.println("Introduzca un número de 3 cifras, que lo calculo matemáticamente: ");
		num2 = teclado.nextInt();
		
		cifra1 = num2/100;
		cifra2 = (num2%100)/10;
		cifra3 = (num2%100)%10;
		
		System.out.printf("%d\n"
				+ "%d\n"
				+ "%d\n", cifra1, cifra2, cifra3);
		
		teclado.close();
	}

}
