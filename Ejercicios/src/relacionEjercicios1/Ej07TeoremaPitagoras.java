package relacionEjercicios1;

import java.util.Scanner;

public class Ej07TeoremaPitagoras {

	public static void main(String[] args) {
		// Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		Scanner teclado = new Scanner(System.in);
		
		float cateto1;
		float cateto2;
		
		System.out.println("Introduzca el valor de un cateto: ");
		cateto1 = teclado.nextFloat();
		System.out.println("Introduzca el valor de otro cateto: ");
		cateto2 = teclado.nextFloat();
		
		System.out.printf("El valor de la hipotenusa con catetos %.2f y %.2f es de %.2f unidades métricas.", cateto1, cateto2, Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2)));
		teclado.close();
	

	}

}
