package relacionEjercicios1;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el principio como en el ejemplo
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int cifras5;
		int cifras4;
		int cifras3;
		int cifras2;
		int cifra;
		
		System.out.println("Introduzca un número de 5 dígitos: ");
		num = teclado.nextInt();
		
		cifra = num/10000;
		cifras2 = num/1000;
		cifras3 = num/100;
		cifras4 = num/10;
		cifras5 = num;
	
		
		System.out.printf("%d\n"
				+"%d\n"
				+"%d\n"
				+"%d\n"
				+"%d\n",
				cifra, cifras2, cifras3, cifras4, cifras5);
		teclado.close();
	}

}
