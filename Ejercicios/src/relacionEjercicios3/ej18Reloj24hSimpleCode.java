package relacionEjercicios3;

import java.util.Scanner;

public class ej18Reloj24hSimpleCode {
public static void main(String[] args) throws InterruptedException {
	// Programa que muestra un reloj durante 24 horas en formato 00:00:00 a 23:59:59
	System.out.println("Esto es un reloj. Se inicializa al abrir la consola.");
	int horas=0, minutos=0, segundos=0;
	
	  Scanner teclado = new Scanner(System.in);

      System.out.println("Vamos a ajustar la hora: ");

      do {
       System.out.println("¿Qué hora es?");
         horas = teclado.nextInt();

         if (horas<0 || horas>23) {
             System.out.println("Usa numeros entre 0 y 23.");
         }
     } while (horas<0 || horas>23);

         do {
         System.out.println("Cuántos minutos?");
         minutos = teclado.nextInt();

          if (minutos<0 || minutos>59) {
             System.out.println("Usa numeros entre 0 y 59.");
         }
     } while (minutos<0 || minutos>59);

         do{
          System.out.println("¿Cuántos segundos?");
         segundos = teclado.nextInt();

          if (segundos<0 || segundos>59) {
             System.out.println("Usa numeros entre 0 y 59.");
         }
     } while (segundos<0 || segundos>59);

     while (true) { //mientras que los datos sean verdaderos

//          System.out.print(horas+":"); //esto me lo escribe en este formato 7:7:7
//          System.out.print(minutos+":");
//          System.out.println(segundos);
    	 //hay una linea para borrar el reloj y que se "sobreponga", pareciendo un reloj digital
    	 //esta linea se escribe al final, después de ponerle la actualización de tiempo, el threadsleep
    	 System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

          segundos++;

          if (segundos == 60) {
             segundos = 0;
             minutos++;

             	if (minutos == 60) {
             		minutos=0;
             		horas++;

             		if (horas == 24) {
             			horas=0;   
          }
      }
  }

		Thread.sleep(1000);
		System.out.printf("\b\b\b\b\b\b\b\b");
		teclado.close();
	}    
}
}
