package relacionEjercicios2;

import java.util.Scanner;

public class ej09CalculoImpuestoEnSueldo {
	public static void main(String[] args) {
		// Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo que calcule los impuestos que debe pagar según la siguiente tabla de tramos: 
			//           Tramo        |   Impuesto (%)  |       Descuento 
			//           0 a 1000     |        0        |     No aplicable 
			//         1000 a 1600    |        5        |  1% por hijo (máximo 5%) 
			//         1600 a 3000    |        10       |  1% por hijo (máximo 10%) 
			//         3000 a 4600    |        15       |  1% por hijo (máximo 10%) 
			//            > 4600      |        20       |  1.5% por hijo (máximo 15%)
		
		System.out.println("El algoritmo calculará los impuestos que un contribuyente ha de pagar según un baremo. Se le pide al usuario su sueldo bruto y su número de hijos.");
		Scanner teclado = new Scanner(System.in);
		double sueldoBruto, impuestos, sueldoNeto ;
		// sueldoBruto=impuestos=sueldoNeto=0; esta linea sería para ponerle un valor 0 por default
		int numHijos = 0;
		
		System.out.println("Introduzca el sueldo a calcular: ");
		sueldoBruto = teclado.nextDouble();
		System.out.println("Introduzca el número de hijos del contribuyente, menores de 25 años residentes con él: ");
		numHijos = teclado.nextInt();
		
		if (sueldoBruto<1000) {
			sueldoNeto = sueldoBruto;
			impuestos = 0;
			System.out.printf("Los impuestos a aplicar para un sueldo de %.2f es 0, por lo que el sueldo bruto se mantiene como sueldo neto.");
			
			
		} else if (sueldoBruto>= 1000 && sueldoBruto<1600) {
					if ( numHijos>=5 ) {
						impuestos = 0;
					} else {
						impuestos = 5 - numHijos;}
			sueldoNeto = sueldoBruto - (sueldoBruto*impuestos/100);
			System.out.printf("Los impuestos a aplicar para un sueldo bruto de %.2f son de %.2f, dando como resultado un sueldo neto de %.2f.", sueldoBruto, (sueldoBruto*impuestos/100), sueldoNeto);
			
			
		} else if (sueldoBruto>= 1600 && sueldoBruto<3000) {
					if ( numHijos>=10 ) {
						impuestos = 0;
					} else {
						impuestos = 10 - numHijos;}
			sueldoNeto = sueldoBruto - (sueldoBruto*impuestos/100);
			System.out.printf("Los impuestos a aplicar para un sueldo bruto de %.2f son de %.2f, dando como resultado un sueldo neto de %.2f.", sueldoBruto, (sueldoBruto*impuestos/100), sueldoNeto);
			
			
		} else if (sueldoBruto>= 3000 && sueldoBruto<4600) {
					if ( numHijos>=10 ) {
						impuestos = 5;
					} else {
						impuestos = 10 - numHijos;}
			sueldoNeto = sueldoBruto - (sueldoBruto*impuestos/100);
			System.out.printf("Los impuestos a aplicar para un sueldo bruto de %.2f son de %.2f, dando como resultado un sueldo neto de %.2f.", sueldoBruto, (sueldoBruto*impuestos/100), sueldoNeto);
			
			
		} else if (sueldoBruto>= 4600) {
					if ( numHijos>=10 ) {
						impuestos = 5;
					} else {
						impuestos = 10 - numHijos*1.5;}
			sueldoNeto = sueldoBruto - (sueldoBruto*impuestos/100);
			System.out.printf("Los impuestos a aplicar para un sueldo bruto de %.2f son de %.2f, dando como resultado un sueldo neto de %.2f.", sueldoBruto, (sueldoBruto*impuestos/100), sueldoNeto);
			}
		teclado.close();
		}}
