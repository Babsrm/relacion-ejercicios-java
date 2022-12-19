package relacionEjercicios2;

import java.util.Scanner;

public class ej06CalculoRectasSecantesOParalelas {

	public static void main(String[] args) {
		// Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, paralelas o secantes. En el caso de que sean secantes, hay que indicar si son perpendiculares o no. Las dos rectas se definen como A1x+B1y+C1=0 y A2x+B2y+C2=0, o sea que pedimos 6 valores por teclado:
		//• Dos rectas son secantes si 𝐴1/𝐴2 ≠ 𝐵1/𝐵2
		//• Dos rectas son perpendiculares si son secantes y 𝐴1/𝐵1 = −𝐵2/𝐴2
		//• Dos rectas son paralelas si 𝐴1/𝐴2 = 𝐵1/𝐵2
		//• Dos rectas son coincidentes si son paralelas y 𝐴1/𝐴2 = 𝐵1/𝐵2 = 𝐶1/𝐶2
		
		Scanner teclado = new Scanner(System.in);
		
		double a1;
		double b1;
		double c1;
		double a2;
		double b2;
		double c2;
		
		System.out.println("Se solicita al usuario los parámetros (a,b,c) de dos rectas. El logaritmo indicará si son coincidentes, paralelas o secantes. De ser secantes, también se indicará si son perpendiculares o no.");
		
		System.out.println("Indique el valor de a1: ");
		a1 = teclado.nextDouble();
		System.out.println("Indique el valor de b1: ");
		b1 = teclado.nextDouble();
		System.out.println("Indique el valor de c1: ");
		c1 = teclado.nextDouble();
		System.out.println("Indique el valor de a2: ");
		a2 = teclado.nextDouble();
		System.out.println("Indique el valor de b2: ");
		b2 = teclado.nextDouble();
		System.out.println("Indique el valor de c2: ");
		c2 = teclado.nextDouble();

		if ((a1 / a2) != (b1 / b2)) {
			
			if ((a1 / b1) == (-b2 / a2)) {
			System.out.println("Las rectas son secantes y perpendiculares."); //2x+3y+4=0  3x-2y+6=0
			} else {
				System.out.println("Las rectas son secantes.");  //3x+4y-2=0  4x+7y+3=0
			}
		};
		
		if ((a1 / a2) == (b1 / b2)) {
			
			if (((a1/a2) == (b1/b2)) && ((c1/c2) == (a1/a2))) {
				System.out.println("Las rectas son paralelas y coincidentes"); // 2x+3y+4=0  4x+6y+8=0
			} else {
				System.out.println("Las rectas son paralelas."); // 2x+3y+4=0  4x+6y+3=0
			}
		}
		teclado.close();
	}
}
