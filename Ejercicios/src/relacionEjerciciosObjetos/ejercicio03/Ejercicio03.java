package relacionEjerciciosObjetos.ejercicio03;

import relacionEjerciciosObjetos.ejercicio01.Persona;

public class Ejercicio03 {

	public static void main(String[] args) {
		Persona menganito = new Persona("Menganito Lopez", 77, "55443322J");
		
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta(new Persona("Fulanito Jiménez", 14, "44455566R")); //se puede declarar la persona directamente aqui
		Cuenta c3 = new Cuenta(menganito, 100); //o la creo en una variable y dejo el código más limpio
		Cuenta c4 = new Cuenta("Pedro Perez", 36, "77744111A", 150); // aqui la creo invocando al constructor que me pide los parámetros de persona
		
		System.out.println(c1.mostrar());
		System.out.println(c2.mostrar());
		System.out.println(c3.mostrar());
		System.out.println(c4.mostrar());
		
		System.out.println("Ingreso 50.55 euros en " + c1.getTitular().getNombre());
		c1.ingresar(50.55);
		System.out.println("Retiro 800.75 euros en " + c2.getTitular().getNombre());
		c2.retirar(800.75);
		System.out.println("Retiro 1 euro en " + c3.getTitular().getNombre());
		c3.retirar(1);
		
		System.out.println(c1.mostrar());
		System.out.println(c2.mostrar());
		System.out.println(c3.mostrar());
		
		System.out.println("El crédito máximo es: " +Cuenta.MAXCREDITO);
	}

}
