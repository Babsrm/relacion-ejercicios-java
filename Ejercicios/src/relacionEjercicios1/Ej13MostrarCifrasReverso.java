package relacionEjercicios1;

import java.util.Scanner;

public class Ej13MostrarCifrasReverso {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int num;
	int cifras5;
	int cifras4;
	int cifras3;
	int cifras2;
	int cifra;
	
	System.out.println("Introduzca un número de 5 dígitos: ");
	num = teclado.nextInt();
	
	cifra= (num%100)%10;
	cifras2 = (num%100)/10;
	cifras3 = (num%1000)/100;
	cifras4 = (num%10000)/1000;
	cifras5 = num/10000;
	
	
	System.out.printf("%d"
			+"%d"
			+"%d"
			+"%d"
			+"%d",
			cifra, cifras2, cifras3, cifras4, cifras5);
	teclado.close();
}
}
