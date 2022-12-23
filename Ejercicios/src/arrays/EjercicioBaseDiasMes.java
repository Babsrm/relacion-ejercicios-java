package arrays;

import java.util.Scanner;

public class EjercicioBaseDiasMes {
public static void main(String[] args) {
	final short dias [] = { //final es CONSTANTE
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	final String meses [] = {
			"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	int mes;
	
	do {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número del mes (1-12).");
		 mes = teclado.nextInt();
	} while (mes<1 || mes>12);
	
	System.out.printf("El mes %d (%s) tiene %d días.", mes, meses[mes-1],dias[mes-1]);
	teclado.close();
}
}
