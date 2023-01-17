package relacionEjerciciosObjetos.ejercicio02;

/*En el método main se crean dos aviones: a1 (fabricante “Airbus” con cuatro motores) y a2 (fabricante “Lookheed” con cuatro motores). 
 * Luego, los datos de cada avión se imprimen por pantalla. 
 * Después, se realizan llamadas a los métodos setFabricante y cambiarFabricante, los cuales cambiarán los valores de sus atributos. 
 * ¿Cuál es el resultado final de la ejecución del método main? Determinar lo que se imprime en pantalla.*/

public class Ejercicio02 {

	public static void main(String[] args) {
		Avion a1 = new Avion ("Airbus", 4);
		Avion a2 = new Avion ("Lookhead", 4);
		
		System.out.println(a1.imprimirFabricante());
		System.out.println(a2.imprimirFabricante());
		
		System.out.println("\nSe va a proceder a hacer cambios: \n"
				+ "El segundo avión cambiará su fabricante al nombre de fabricante del primer avión;\n"
				+ "después el primer avión pasará a fabricarse por Boeing.\n");		
		
		a2.cambiarFabricante(a1);
		a1.setFabricante("Boeing");
		
		System.out.println(a1.imprimirFabricante() + "(después del cambio)");
		System.out.println(a2.imprimirFabricante() + "(después del cambio)");

	}

}
