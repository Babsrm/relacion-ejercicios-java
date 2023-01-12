package string;

import java.util.Scanner;

public class PruebaString {

	public static void main(String[] args) {
		String usuario = "barbara";
		String password = "123";
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el usuario: ");
		String userIntro = teclado.next();
		System.out.println("Introduce contraseña: ");
		String passIntro = teclado.next();
		
		if (userIntro.equalsIgnoreCase(usuario) && passIntro.equals(password)) {
			System.out.println("Usuario correcto.");
		} else { System.out.println("Usuario incorrecto o contraseña incorrecta.");
		}
		
		teclado.close();
	}

}
