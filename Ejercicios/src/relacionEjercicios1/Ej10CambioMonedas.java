package relacionEjercicios1;

import java.util.Scanner;

public class Ej10CambioMonedas {

	public static void main(String[] args) {
		// Programa que calcule el cambio que se debe devolver al usuario. Se pedirán por teclado dos números, el precio del artículo y el importe introducido. Se devolverá el número de monedas a entregar óptimo suponiendo que tenemos disponibilidad de monedas infinita.
		Scanner teclado = new Scanner(System.in);
		
		double precio;
		double valor_introducido;
		
		int moneda2;
		int moneda1;
		int moneda50;
		int moneda20;
		int moneda10;
		int moneda05;
		int moneda02;
		int moneda01;
		
		System.out.println("Introduzca el valor del producto: ");
		precio = teclado.nextFloat();
		System.out.println("Introduzca la cantidad introducida para calcular el cambio: ");
		valor_introducido = teclado.nextFloat();
		
		double resultado = valor_introducido - precio;
		
		moneda2 = (int)resultado/2;
		moneda1 = (int)resultado%2;
		
		int centimos;
		
		centimos = (int) ((resultado - (int)resultado) *100); //al resultado con decimales le he restado la parte entera para quedarme solo con decimales. después lo he multiplicado por 100 para volverlo entero pero sigue siendo decimal por lo que se ha tenido que poner el int delante para convertirlo a entero.
		
		moneda50 = (int)centimos/50;
		centimos = centimos%50;
		moneda20 = (int)centimos/20;
		centimos = centimos%20;
		moneda10 = (int)centimos/10;
		centimos = centimos%10;
		moneda05 = (int)centimos/5;
		centimos = centimos%5;
		moneda02 = (int)centimos/2;
		centimos = centimos%2;
		moneda01 = (int)centimos/1;
		
		System.out.printf("Al usuario se le devuelve un total de %.2f con la siguiente distribución:\n"
				+"%d monedas de 2 euros,\n"
				+"%d monedas de 1 euros,\n"
				+"%d monedas de 50 céntimos,\n"
				+"%d monedas de 20 céntimos,\n"
				+"%d monedas de 10 céntimos,\n"
				+"%d monedas de 5 céntimos,\n"
				+"%d monedas de 2 céntimos,\n"
				+"%d monedas de 1 céntimos.\n",
				resultado, moneda2, moneda1, moneda50, moneda20, moneda10, moneda05, moneda02, moneda01
				);
		teclado.close();
	
	}

}
