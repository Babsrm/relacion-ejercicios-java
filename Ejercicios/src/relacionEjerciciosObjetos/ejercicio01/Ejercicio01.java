package relacionEjerciciosObjetos.ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Persona fulanito = new Persona("Fulanito Jiménez", 14, "444555666R");
		Persona menganito = new Persona("Menganito Lopez", 77, "55443322J");
		
		System.out.println(fulanito.mostrar());		
		System.out.println(menganito.mostrar());
		
		if (fulanito.esMayorDeEdad()) {
			System.out.println(fulanito.getNombre() +" es mayor de edad.");
		} else {
			System.out.println(fulanito.getNombre() +" es menor de edad.");
		}
		
		if (menganito.esMayorDeEdad()) {
			System.out.println(menganito.getNombre() +" es mayor de edad.");
		} else {
			System.out.println(menganito.getNombre() +" es menor de edad.");
		}
		
		Persona pruebaDni = new Persona();
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un dni:");
		pruebaDni.setDni(teclado.nextLine());
		
		teclado.close();
	}

}
