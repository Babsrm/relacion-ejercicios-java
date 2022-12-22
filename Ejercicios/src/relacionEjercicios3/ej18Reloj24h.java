package relacionEjercicios3;

import java.util.Scanner;

public class ej18Reloj24h {
public static void main(String[] args) throws InterruptedException {
	// Programa que muestra un reloj durante 24 horas en formato 00:00:00 a 23:59:59
	System.out.println("Esto es un reloj. Se inicializa al abrir la consola.");
	int horas=0, minutos=0, segundos=0;
	
	  Scanner teclado = new Scanner(System.in);

	  	for (horas = 0; horas <24; horas ++) {
	  		for (minutos = 0; minutos < 60; minutos++) {
	  			for (segundos = 0; segundos <60; segundos++) {
	  				System.out.printf("%02d:%02d:%02d");
	  				Thread.sleep(1000);
	  				System.out.printf("\b\b\b\b\b\b\b\b"); //borra para "sobreescribir" la hora de nuevo en el bucle
	  			}
	  		}//si queremos que se reinicie a las 24h, metemos el bucle for al completo en un do while, siendo while(true)
	  	}
  
		teclado.close();
	}    
}

