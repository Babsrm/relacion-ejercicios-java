package relacionEjercicios1;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento.
		Scanner teclado = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
		
		System.out.println("Vamos a calcularle su número de la suerte.");
		System.out.println("Según su fecha de nacimiento, introduzca el día: ");
		dia = teclado.nextInt();
		System.out.println("Introduzca ahora el mes de nacimiento: ");
		mes = teclado.nextInt();
		System.out.println("Por último, introduzca su año de nacimiento: ");
		ano = teclado.nextInt();
		
		int cifraDia1 = dia/10;
		int cifraDia2= dia%10;
		int cifraMes1 = mes/10;
		int cifraMes2 = mes%10;
		int cifraAno1 = ano/1000;
		int restoAno = ano%1000;
		int cifraAno2 = restoAno/100;
		restoAno = restoAno%100;
		int cifraAno3 = restoAno/10;
		int cifraAno4 = restoAno%10;
		int resultado = cifraDia1 + cifraDia2 + cifraMes1 + cifraMes2 + cifraAno1 + cifraAno2 + cifraAno3 + cifraAno4;
		
		System.out.printf("Su fecha de nacimiento es %d-%d-%d.\n"
							+"%d + %d + %d + %d + %d + %d + %d +%d = %d.",
							dia, mes, ano, cifraDia1, cifraDia2, cifraMes1, cifraMes2, cifraAno1, cifraAno2, cifraAno3, cifraAno4, resultado
		);

        
	}

}
