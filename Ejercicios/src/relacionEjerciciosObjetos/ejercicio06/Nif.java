package relacionEjerciciosObjetos.ejercicio06;

import java.util.Scanner;

/*
Crea una clase NIF que se usará para mantener DNIs con su correspondiente letra. Los atributos serán el número de DNI (entero largo) y la letra que le corresponde. La clase dispondrá de los siguientes métodos:
•Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio en blanco (será un NIF no válido).
•Constructor que reciba el DNI y establezca la letra que le corresponde.
•Accedentes y mutador (getters y setters) para el número de DNI (que ajuste automáticamente la letra).
•leer(): que pida el número de DNI (ajustando automáticamente la letra)
•Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en mayúscula; por ejemplo: 00395469-F) 
----La letra se calculará con un método auxiliar (privado) de la siguiente forma:se obtiene el resto de la división entera del número de DNI entre 23 y se usa la siguiente tabla para obtener la letra que corresponde:
0 -T   1 -R   2 -W   3 -A   4 -G   5 -M   6 –Y   7 -F   8 -P   9 -D   10 -X
11 -B  12 -N  13 –J  14 -Z  15 -S  16 -Q  17 -V  18 -H  19 -L  20 –C  21 -K  22 –E  ----*/

public class Nif {
	private long num;
	private char letra;
	private final static char LETRAS[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	
	public Nif () {
		setNum(0);
		setLetra(' ');
	}
	
	public Nif (long num) {
		setNum(num);
		setLetra(calculoLetra(num));
		
	}

	public Nif(long num, char letra) {
	this.num = num;
	this.letra = letra;
}

	public long getNum() {
		return num;
	}


	public void setNum(long num) {
		this.num = num;
	}


	public long getLetra() {
		return letra;
	}


	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	private char calculoLetra (long num) {
		int resto = 0;
		resto = Math.floorMod(num,23);
		return LETRAS[resto];
	}
	
	public void leer() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número de dni: ");
		long num = teclado.nextLong();
		setNum(num);
		setLetra(calculoLetra(num));
	}
	public String mostrarDni() {
		return "El Nif introducido es: " + num + "-" + letra + ".";
	}
	
	
}
